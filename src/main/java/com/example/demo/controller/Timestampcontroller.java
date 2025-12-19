package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Timestampentity;
import com.example.demo.service.Timestampservice; 






@RestController
public class Timestampcontroller{
   @Autowired Timestampservice ser;

   @PostMapping("/postT")
   public Timestampentity sendData(@RequestBody Timestampentity stamp){
    return ser.postVal1(stamp);
   }
}