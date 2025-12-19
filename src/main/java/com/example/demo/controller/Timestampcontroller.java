package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Validationentity;
import com.example.demo.service.Validationservice; 






@RestController
public class Timestampcontroller{
   @Autowired Timestampservice ser;

   @PostMapping("/post1")
   public Timestampentity sendData(@Valid @RequestBody Timestampentity stamp){
    return ser.postVal1(val);
   }
}