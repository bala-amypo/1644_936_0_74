package com.example.demo.entity;


public class Timestamp{
    private Long id;
    private String name;
    private String email;
    private String password;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

     public void setId(long id){
        this.id=id;
    }
    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
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
    public Date getCreateAt(){
        return creatAt;
    }
    public void setCreated(LocalDateTime creatAt){
        this.creatAt=creatAt;
    }
    public Date getUpdateAt(){
        return UpdateAt;
    }
    public Date setUpdateAt(LocalDateTime updateAt){
        this.updateAt=updateAt
    }
    public Timestamp(long id,String name,String email,String password,LocalDateTime creatAt,LocalDateTime UpdateAt){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.creatAt=creatAt;
        this.updateAt=UpdateAt
    }
    public Studententity(){

    }

}