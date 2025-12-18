package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.Studentservice;
import com.example.demo.repository.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Studententity;

import java.util.List;

@Service
public class Studentserviceimpl implements Studentservice{
     @Autowired Studentrepo student;
    
     @Override
    public Studententity postData(Studententity stu){
        return student.save(stu);
    }
    @Override
   public  List<Studententity>getAllData(){
        return student.findAll();
    }
    @Override
   public  String DeleteData(int id){
           student.deleteById(id);
           return "Deleted Successfuly";
   }
   @Override
   public Studententity getDta(int id){
    return student.findById(id);
   }

}