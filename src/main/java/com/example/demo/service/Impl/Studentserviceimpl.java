package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.studentservice;

@Service
public class Studentserviceimpl implements Studentservice{
     @Autowired Studentrepo student;
     //save
     //findAll()
     //findById()
     //deleteById();
     //existById();

     @Override
    public Studententity postData(Studententity stu){
        return student.save(stu);
    }
    
}