package com.example.demo.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class Globalexception{

@ExceptionHandler(Validationmexception.class)
public ResponseBody<String>handleValidationexception(){
    return new ResponseBody<String>();
}
}