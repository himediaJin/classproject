package com.app.board.controller.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/write")
public class BoardWriteController {

    @GetMapping
    public void writeForm(){

    }


}
