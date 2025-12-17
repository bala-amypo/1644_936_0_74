package com.example.demo.entity;


@Entity
public class Studententity{
     private Integer id;
     private String username;
     private String email;
     private String password;
     private Date createAt;


     public Integer getId(Integer id){
        return id;
     }

     public void  setId(){
        this.id=id;
     }

     public String getUsername(String Name){
        return name;
     }
     public void setUsername(){
        this.name=name;
     }
     public String getEmail(String email){
        return email;
     }
     public void setEmail(){
        this.email=email;
     }
     public String getPassword(String password){
        return password;
     }
     public void setPassword(){
        this.password=password;
     }
     public Date getCreatAt(Date CreateAt){
        return createAt;
     }
     public void setCreateAt(){
        this.createAt=createAt;
     }

     
}