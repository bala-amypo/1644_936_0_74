package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.postMapping;
import org.springframework.
import org.springframework.web.bind.annotation.Restcontroller;
import com.example.demo.service.Studentservice; 


@Restcontroller
public class Studentcontroller{
   @Autowired Studentservice service;

   @postMapping("/post")
   public Studententity sendData(@RequestBody Studententity stu){
    return ser.postData(stu);
   }
}
