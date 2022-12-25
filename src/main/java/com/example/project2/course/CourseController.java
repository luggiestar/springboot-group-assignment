package com.example.project2.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/course")
public class CourseController {
    private CourseService courseService;

    //inject the service to controller class
    @Autowired
    public CourseController(CourseService courseService) {this.courseService = courseService;}

    public List<Course> getCourses() {return this.courseService.getCourses(); }
}
