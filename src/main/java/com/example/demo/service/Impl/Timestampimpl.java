package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.Validationservice;


@Service
public class Timestampserviceimpl implements Timestampservice{
     @Autowired Validationrepo valid;
    
     @Override
    public Tentity postData2(Validationentity val){
        return valid.save(val);
    }