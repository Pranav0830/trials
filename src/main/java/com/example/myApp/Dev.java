package com.example.myApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired //field injection
    private Laptop laptop;


    public void build(){

        laptop.compile();
        System.out.println("Working on Awesome project");
        System.out.println("Building Laptop");
    }
}
