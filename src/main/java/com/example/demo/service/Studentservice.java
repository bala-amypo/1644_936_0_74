package com.example.demo.service;

import com.example.demo.entity.Studententity;
import org.springframework.web.bind.annotation.RequestBody;
public interface Studentservice{
    Studententity postData(@RequestBody Studententity stu);
}