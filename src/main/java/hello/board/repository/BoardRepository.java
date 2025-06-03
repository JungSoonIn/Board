package hello.board.repository;

import hello.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> { //< >에는 엔티티 클래스이름과 그 클래스의 PK의 타입

}
