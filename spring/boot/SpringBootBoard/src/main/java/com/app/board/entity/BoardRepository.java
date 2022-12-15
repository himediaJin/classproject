package com.app.board.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface BoardRepository extends JpaRepository<Board, Integer> {
    /*@Transactional
    @Modifying
    @Query("delete from Board b where b.bno = ?1")
    int deleteByBno(Integer bno);*/
    long deleteByBno(Integer bno);



    // 페이징
    // view 페이지
    // 입력, 저장
    // 수정
    // 삭제




}
