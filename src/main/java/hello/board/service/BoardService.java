package hello.board.service;

import hello.board.dto.BoardDTO;
import hello.board.entity.BoardEntity;
import hello.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// DTO를 Entity클래스로 변환하거나 Entity로 가져온 클래스를 DTO클래스로 변환하거나
// 서비스 클래스에서는 이런 식으로 변환하는 작업들이 많이 생긴다.
// DTO -> Entity 변환은 Entity 클래스에서
// Entity -> DTO 변환은 DTO 클래스에서

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
