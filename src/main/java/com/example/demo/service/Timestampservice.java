package com.example.demo.service;

import com.example.demo.entity.Timestampentity;
import org.springframework.web.bind.annotation.RequestBody;

public interface Timestampservice{
    Timestampentity postVal1(@RequestBody Timestampentity val);

}