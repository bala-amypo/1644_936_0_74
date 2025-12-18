package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;




@Entity
public class Validationentity{
      @Id
      @GeneratedValue(strategy=GenerartionType.IDENTITY)
     private Long id;
     @NotNull
     @Size(min = 2,max =10,message = "must be 2 to 10  character")
     private String username;
     @Email(message="Email is not valid")
     private String email;
     @Size(min = 2,max=10,message="must be 2 to 10  character" )
     @NotNull(message ="Password is mandatory")
     private String password;
     @Max(30)
     @Positive(message ="Age must be a positive number")
     private Integer age;

      public Long getId(){
        return id;
     }

     public void  setId(Long id){
        this.id=id;
     }

     public String getUsername(){
        return username;
     }
     public void setUsername(String username){
        this.username=username;
     }
     public String getEmail(){
        return email;
     }
     public void setEmail(String email){
        this.email=email;
     }
     public String getPassword(){
        return password;
     }
     public void setPassword(String password){
        this.password=password;
     }
     public Integer getAge(){
        return age;
     }
     puiblic void setAge(Integer age){
        this.age=age;
     }
      public  Studententity(Long id,
        @Size(min = 2,max =10,message = "must be 2 to 10  character")
        @Email(message="Email is not valid")
        @Size(min = 2,max=10,message="must be 2 to 10  character" )
        @NotNull(message ="Password is mandatory")
        @Positive(message ="Age must be a positive number")Integer age){
     
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.age=age;
     }
}