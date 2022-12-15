package com.app.board;

import com.app.board.domain.BoardWriteRequest;
import com.app.board.entity.Board;
import com.app.board.entity.BoardRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

@SpringBootTest
@Log4j2
public class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;


    @Test
    public void saveTest(){

        BoardWriteRequest writeRequest = BoardWriteRequest.builder()
                .title("JPA 테스트")
                .content("JPA 테스트 내용 입력")
                .writer("테스터")
                .build();

        Board board = writeRequest.toBoardEntity();

        log.info(boardRepository.save(board));


    }

    @Test
    public void findIdTest(){
        Optional<Board> board = boardRepository.findById(115);
        log.info(board.orElse(null));
    }

    @Test
    public void editTest(){

        Optional<Board> result = boardRepository.findById(115);

        Board board = result.orElse(null);

        log.info(board);

        // 변경할 데이터 생성
        board.setTitle("JPA 에서 수정");
        board.setContent("수정한 내용");
        board.setUpdatedate(LocalDate.now());

        Board editResult = boardRepository.save(board);

        log.info(editResult);

    }

    @Test
    @Transactional // JPA는 transaction을 기반으로 작동 delete 시 transaction을 찾지 못해 에러 발생 발생 -> @Transactional 추가 필요
    public void deleteByIdTest(){
        long result = boardRepository.deleteByBno(111);
        log.info(">>>>>> 삭제 결과 >>>>>>> " + result);
    }

    @Test
    public void FindAllTest(){

        Page<Board> page = boardRepository.findAll(PageRequest.of(0,10, Sort.by("bno").descending()));

        log.info(">>>>>> 결과 >>>>>>> ");
    }


}
