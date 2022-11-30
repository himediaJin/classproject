package com.app.board.service;

import com.app.board.domain.BoardDTO;
import com.app.board.domain.BoardListDTO;
import com.app.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardRegService {

    @Autowired(required = false)
    private BoardMapper boardMapper;

    public int regBoardContent(BoardDTO boardDTO){
        return boardMapper.insertBoardContent(boardDTO);
    }
}
