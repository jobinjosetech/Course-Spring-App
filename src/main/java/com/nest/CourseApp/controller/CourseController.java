package com.nest.CourseApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to CourseApp";
    }

}
