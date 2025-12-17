package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.studentservice;

@Service
public class Studentserviceimpl implements Studentservice{
     @Autowired Studentrepo student;
     //save
     //findAll()
    public Studententity postData(Studententity student);
}