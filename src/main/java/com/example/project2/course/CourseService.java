package com.example.project2.course;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    public List<Course> getCourses() {
        return List.of(
                new Course(
                        1L,
                        "Intro to databsse",
                        "CSS114".toUpperCase()
                )
        );
    }
}
