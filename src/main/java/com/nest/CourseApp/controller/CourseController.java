package com.nest.CourseApp.controller;

import com.nest.CourseApp.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/")
    public String HomePage(){
        return "Welcome to CourseApp";
    }

    @GetMapping("/view")
    public String ViewCourse(){
        return "Welcome to Course View Page";
    }

    @PostMapping(path="/add", consumes = "application/json", produces = "application/json")
    public String AddCourse(@RequestBody Course c){
        System.out.println(c.getTitle());
        System.out.println(c.getDescription());
        System.out.println(c.getVenue());
        System.out.println(c.getDuration());
        System.out.println(c.getDate());
        return "Welcome to CourseApp";
    }

}
