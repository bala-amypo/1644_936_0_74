package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




import com.example.demo.entity.Validationentity;
import com.example.demo.service.Validationservice; 



@RestController
public class Validationcontroller{
   @Autowired Validationservice ser;

   @PostMapping("/post")
   public Validationentity sendData(@valid @RequestBody Validationentity entity){
    return ser.postData(entity);
   }
   


   

}
