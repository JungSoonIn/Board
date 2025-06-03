package hello.board.controller;

import hello.board.dto.BoardDTO;
import hello.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/board/save")
    public String saveForm() {
        return "save";
    }

    @PostMapping("/board/save")
    public String save(@ModelAttribute BoardDTO boardDTO) {
        boardService.save(boardDTO);
        return "index";
    }
}
