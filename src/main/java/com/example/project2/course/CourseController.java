package com.example.project2.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/course")
public class CourseController {
    private final CourseService courseService;

    //inject the service to controller class
    @Autowired
    public CourseController(CourseService courseService) {this.courseService = courseService;}

    @GetMapping
    public List<Course> getCourses() {return this.courseService.getCourses(); }

    @PostMapping
    public void createNewCourse(Course course) {
        courseService.createNewCourse(course);
    }
}
