package com.app.board.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Integer> {

    // 전체페이지
    // 입력, 저장
    // 수정
    // 삭제
    long deleteByRno(Integer rno);

}
