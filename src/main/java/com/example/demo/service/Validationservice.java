package com.example.demo.service;

import com.example.demo.entity.Validationentity;
import org.springframework.web.bind.annotation.RequestBody;

public interface Validationservice{
    Studententity postData(@RequestBody Studententity stu);

   
    
}