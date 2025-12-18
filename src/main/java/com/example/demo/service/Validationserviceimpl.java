package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.Validationtservice;
import com.example.demo.repository.Validationrepo;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Validationentity;


@Service
public class Validationserviceimpl implements Validationservice{
     @Autowired Validationrepo valid;
    
     @Override
    public Validationentity postData(Validationentity val){
        return valid.save(val);
    }
  
}