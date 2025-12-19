package com.example.demo.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;





@RestControllerAdvice
public class Globalexception{

@ExceptionHandler(Validationmexception.class)
public ResponseEntity<String>handleValidationexception(Validationexception ex){
    return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_GATWAY);
}
}