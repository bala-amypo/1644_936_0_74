package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Timestampentity;

@Repository
public interface Timestamprepo extends JpaRepository<Timestampentity,Long>{
      

      
}