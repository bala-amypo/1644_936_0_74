package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;




@Entity
public class Validationentity{
      @Id
      @GeneratedValue(strategy=GenerartionType.IDENTITY)
     private Long id;
     @NotNull
     @Size(min = 2,max =n 30,message = "must be 2 to 10  character")
     private String username;
     @Email(message="Email is not valid")
     private String email;
     @Max(6)
     @NotNull(message ="Password is mandatory")
     private String password;
     @Max(30)
     private Integer age;
}