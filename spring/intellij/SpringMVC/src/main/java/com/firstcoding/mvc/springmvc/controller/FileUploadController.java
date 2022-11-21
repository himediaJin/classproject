package com.firstcoding.mvc.springmvc.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Log4j2
@Controller
@RequestMapping("/report")
public class FileUploadController {

    @GetMapping
    public String getReportForm(){
        return "/report/reportForm";
    }

    // 1. @RequestParam
    // 2. MultipartHttpServletRequest
    // 3. 커맨드 객체

    @PostMapping("/submit1")
    public String result1(
            @RequestParam("snum") String snum,
            @RequestParam("sname") String sname,
            @RequestParam("report") MultipartFile report
    ){

        log.info("학번 : " + snum);
        log.info("이름 : " + sname);
        log.info("리포트 파일 : " + report.getOriginalFilename() );

        return "report/submit1";
    }

}
