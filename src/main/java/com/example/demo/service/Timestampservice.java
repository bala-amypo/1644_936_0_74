package com.example.demo.service;

import com.example.demo.entity.Timestampentity;
import org.springframework.web.bind.annotation.RequestBody;

public interface Validationservice{
    Validationentity postData2(@RequestBody Validationentity val);

}