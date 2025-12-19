package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice; 



@RestController
public class Studentdetailscontroller{
   @Autowired Studentdetailsservice ser;

   @PostMapping("/post")
   public Studentdetailsentity sendData(@RequestBody Studentdetailsentity stu){
    return ser.postData(stu);
   }
   }