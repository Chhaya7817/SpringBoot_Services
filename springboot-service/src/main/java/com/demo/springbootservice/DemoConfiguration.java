package com.demo.springbootservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class DemoConfiguration {

    @Bean
    public ArrayList<Integer> getNumbers(){
        System.out.println("Inside bean method which creates and retuens arrayList to Springboot");
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        return  numbers;
    }
}
