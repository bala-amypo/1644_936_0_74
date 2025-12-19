package com.example.demo.exception;
import org.springframework.http.
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;





@RestControllerAdvice
public class Globalexception{

@ExceptionHandler(Validationmexception.class)
public Responseentity<String>handleValidationexception(){
    return new Responseentity<String>(ex.getMessage(),HttpStatus.BAD_GATWAY);
}
}