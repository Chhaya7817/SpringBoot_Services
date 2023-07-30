package com.demo.springbootservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class SampleClass {

    HelloRestAPI helloRestAPI;

    ArrayList<Integer> numbers;
    @Autowired
    public SampleClass(HelloRestAPI helloRestAPI,ArrayList<Integer> numbers){
        System.out.println(helloRestAPI.getHelloWorld());
        System.out.println(numbers);
        this.helloRestAPI = helloRestAPI;
        this.numbers=numbers;
        System.out.println("Inside Sample Class");
    }
}
