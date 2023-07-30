package com.demo.springbootservice;
import org.springframework.stereotype.Component;
@Component

public class HelloRestAPI {

    public HelloRestAPI(){
        System.out.println("I'm insise Hello rest API");
    }

    public String getHelloWorld() {
        return "Hello World";
    }
}
