package com.firstcoding.mvc.springmvc.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Log4j2
public class CommonExceptionAdvice {

    @ExceptionHandler(NumberFormatException.class)
    @ResponseBody
    public String exceptionNumber(NumberFormatException exception){

        log.info(exception.getMessage());

        return "NumberFormatException ...";
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public String exceptionNull(NullPointerException exception){

        log.info(exception.getMessage());

        return "NullPointerException ...";
    }
}
