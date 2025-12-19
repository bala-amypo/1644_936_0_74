package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Timestampcontroller{
   @Autowired Timestampservice ser;

   @PostMapping("/post2")
   public Timestampentity sendData(@Valid @RequestBody Timestampentity val){
    return ser.postData2(val);
   }