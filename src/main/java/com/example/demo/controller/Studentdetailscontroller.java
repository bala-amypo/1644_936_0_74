package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Studentdetailsentity;
import com.example.demo.service.Studentdetailsservice; 



@RestController
public class Studentdetailscontroller{
   @Autowired Studentdetailsservice ser;

   @PostMapping("/postL")
   public Studentdetailsentity sendData5(@RequestBody Studentdetailsentity stu){
    return ser.postData5(stu);
   }
   }