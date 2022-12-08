package com.app.board.controller.board;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;

@Controller
@Log4j2
public class ImageViewController {

    @GetMapping(value = "/upload/photo/{fileName}", produces = MediaType.IMAGE_PNG_VALUE)
    @ResponseBody
    public ResponseEntity<byte[]> viewImage(
            @PathVariable("fileName") String fileName
    ){

        log.info(" ImageView Controller ...");

        File savedFile = new File(new File("").getAbsolutePath(), "photo\\"+fileName);

        if(savedFile.exists()){
            // 응답 처리
        }

        return new ResponseEntity<byte[]>(null, HttpStatus.NOT_FOUND);
    }
}
