package hello.board.entity;


import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.stereotype.Service;

// DB의 테이블 역할을 하는 클래스
@Entity
@Getter
@Service
@Table(name = "board_table")
public class BoardEntity extends BaseEntity {
    @Id // pk 컬럼 지정. 필수
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(length = 20, nullable = false) // 크기 20, not null 지정
    private String boardWriter;

    @Column // 기본 값 : 크기 255, null 가능
    private String boardPass;

    @Column
    private String boardTitle;

    @Column(length = 500)
    private String boardContents;

    @Column
    private int boardHits;
}
