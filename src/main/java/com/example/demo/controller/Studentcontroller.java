package com.example.demo.controller;

import.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Restcontroller;

@Restcontroller
public class Studentcontroller{
   @Autowired Studentservice service;
}