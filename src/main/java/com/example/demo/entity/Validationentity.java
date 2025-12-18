package com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class Validationentity{
      @Id
      @GeneratedValue(strategy=GenerartionType.IDENTITY)
     private Long id;
     @nOT
     private String username;
     private String email;
     private String password;
     private Integer age;
}