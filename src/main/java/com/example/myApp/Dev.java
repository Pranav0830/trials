package com.example.myApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired //field injection
    private Laptop laptop;


    public void build(){
        System.out.println("building the git changes");
        laptop.compile();
        System.out.println("Working on Awesome project");
        System.out.println("Building Laptop");
    }
}
