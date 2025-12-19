package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Timestampentity{
    private Long id;
    private String name;
    private String email;
    private String password;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    

}