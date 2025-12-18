package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.Validationtservice;
import com.example.demo.repository.Validationrepo;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Validationentity;


@Service
public class Validationserviceimpl implements Validationservice{
     @Autowired Validationrepo student;
    
     @Override
    public Validationentity postData(Validationentity stu){
        return student.save(stu);
    }
  
}