package com.example.day18exercise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/name")
    public String name(){
        return "My name is Mshari";
    }
    @GetMapping("/age")
    public int age(){
        return 25;
    }
    @GetMapping("/check/status")
    public String checkStatus(){
        return "Everything is OK";
    }
    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }
    @GetMapping("/names")
    public String[] names(){
        return new String[]{"Mshari", "Waleed", "Faisal", "Mohammed"};
    }






}
