package com.app.board.controller;

import com.app.board.domain.BoardDTO;
import com.app.board.domain.BoardListDTO;
import com.app.board.service.BoardListService;
import com.app.board.service.BoardRegService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
@RequestMapping("/board/reg")
public class BoardRegController {

    @Autowired
    private BoardRegService boardRegService;

    @GetMapping
    public void getRegForm(){
    }

    @PostMapping
    public String reg(
            BoardDTO boardDTO
    ){

        log.info(boardDTO);

        boardRegService.regBoardContent(boardDTO);

        return "redirect:/board/list";
    }

}
