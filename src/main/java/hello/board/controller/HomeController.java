package hello.board.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index"; // resources/templates에서 index.html파일을 찾아감.
    }
}
