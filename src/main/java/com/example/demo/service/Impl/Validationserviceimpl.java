package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.Validationservice;
import com.example.demo.repository.Validationrepo;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Validationentity;


@Service
public class Validationserviceimpl implements Validationservice{
     @Autowired Validationrepo valid;
    
     @Override
    public Validationentity postData2(Validationentity val){
        return valid.save(val);
    }
    @Override
   public Validationentity getData(int id){
    return valid.findById(id);
   }
 
  
}