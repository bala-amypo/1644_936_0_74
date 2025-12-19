package com.example.demo.service;

import com.example.demo.entity.Validationentity;
import org.springframework.web.bind.annotation.RequestBody;

public interface Validationservice{
    Validationentity postData2(@RequestBody Validationentity stamp);
    Validationentity getData1(Long id);
   
    
}