package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Restcontroller;
import com.example.demo.service.Studentservice; 


@Restcontroller
public class Studentcontroller{
   @Autowired Studentservice service;
}