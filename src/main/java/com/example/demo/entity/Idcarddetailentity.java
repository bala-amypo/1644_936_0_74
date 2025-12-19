package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.One;
import jakarta.persistence.GeneratedValue;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Idcarddetailentity{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String cardnumber;
    private String studentid;


    @OneToOne 
    private studentdetails student;

}