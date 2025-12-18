package com.example.demo.service;

import com.example.demo.entity.Studententity;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
public interface Studentservice{
    Studententity postData(@RequestBody Studententity stu);

    List<Studententity>getAllData();
    String DeleteData(int id);
    Studententity getData(int id);
    
}