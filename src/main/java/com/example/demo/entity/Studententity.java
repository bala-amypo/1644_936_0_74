package com.example.demo.entity;


import jakarta.persistance.Entity;
import jakarta.persistance.Id;

@Entity
public class Studententity{
    @Id
    @generatedValue
     private Integer id;
     private String username;
     private String email;
     private String password;
     private Date createAt;

     public  Studententity(Integer id,String username,String email,String password,String createAt){
        this.id=id;
        this.username=username;
        this.email=email;
        this.password=password;
        this.createAt=createAt;
     }
     public Studententity(){

     }


     public Integer getId(){
        return id;
     }

     public void  setId(Integer id){
        this.id=id;
     }

     public String getUsername(){
        return usernamename;
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
     public Date getCreatAt(){
        return createAt;
     }
     public void setCreateAt(Date createAt){
        this.createAt=createAt;
     }

     
}