package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Timestampentity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    @PrePersist
      LocalDateTime now=new LocalDateTime.now();
    public void Oncreate(){
        this.createAt=now;
        this.updateAt=now;
    }

    @PreUpdate
    public void Onupdate(){
        this.updateat=now;
    }


    

}