package com.app.board.controller;

import com.app.board.domain.ReplyDTO;
import com.app.board.service.ReplyListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/reply")
public class ReplyRestController {

    @Autowired
    private ReplyListService replyListService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ReplyDTO>> selectAll(){

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("content-Type", "application/json");

        return new ResponseEntity<>(replyListService.selectAll(), httpHeaders, HttpStatus.OK);
    }


    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
    public ResponseEntity<Map<String, String>> except(Exception exception){

        Map<String, String> map = new HashMap<>();
        map.put("error message", exception.getMessage());
        map.put("error type", exception.getClass().getSimpleName());

        return ResponseEntity.internalServerError().body(map);

    }

}
