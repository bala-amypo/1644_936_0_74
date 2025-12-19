package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.Studentdetailsservice;
import com.example.demo.repository.Studendetailstrepo;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Studentdetailsentity;



@Service
public class Idcarddetailserviceimpl implements Studentservice{
     @Autowired Studendetailstrepo student;
    
     @Override
    public Idcarddetailsentity postData(Studentdetailsentity stu){
        return student.save(stu);
    }