package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;


import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice; 



@RestController
public class Studentcontroller{
   @Autowired Studentservice ser;

   @PostMapping("/post")
   public Studententity sendData(@RequestBody Studententity stu){
    return ser.postData(stu);
   }
   }