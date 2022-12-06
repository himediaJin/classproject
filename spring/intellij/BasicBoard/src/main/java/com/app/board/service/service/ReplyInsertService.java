package com.app.board.service.service;

import com.app.board.domain.ReplyDTO;
import com.app.board.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyInsertService {

    @Autowired(required = false)
    private ReplyMapper replyMapper;

    public int insertReply(ReplyDTO replyDTO){   // rno=0
        return replyMapper.insertReply(replyDTO);   // rno=새롭게 등록된 값
    }

}
