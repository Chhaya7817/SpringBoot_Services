package com.demo.springbootservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class WelcomeController {

    ArrayList<Integer> numbers;
//    @Value("Chhaya")
    @Value("${name}")
    String name;
    @Autowired
    public WelcomeController(ArrayList<Integer> numbers){
        this.numbers=numbers;
    }
    @GetMapping
    public String getWelcomeMessage(){
        return numbers.toString();
//        return "<h1>Hey ! chhaya I am making restController</h1>";
    }

//    @GetMapping
    @GetMapping("/name")
    public  String getName(){
        return name;
    }

    @PutMapping
    public String putApi() {
        return "this is put method api";
    }

    @PatchMapping
    public String patchApi() {
        return "this is patch method api";
    }
//    to run on windows use this cmnd or postman
//    Invoke-WebRequest -Uri http://localhost:8080 -Method PATCH


    @DeleteMapping
    public String deleteApi() {
        return "this is delete method api";
    }


}
