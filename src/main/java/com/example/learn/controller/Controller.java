package com.example.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {

     @RequestMapping("/client1")
     public String client1(){
         return "success111221";
     }

}
