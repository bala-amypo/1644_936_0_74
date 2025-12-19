package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.Timestampservice;
import com.example.demo.repository.Timestamprepo;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Timestampentity;


@Service
public class Timestampserviceimpl implements Timestampservice{
     @Autowired Validationrepo valid;
    
     @Override
    public Timestampentity postVal1(Timestampentity stamp){
        return valid.save(stamp);
    }
}