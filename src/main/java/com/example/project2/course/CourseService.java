package com.example.project2.course;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    public List<Course> getCourses() {
        return this.courseRepository.findAll();
    }

    public void createNewCourse(Course course) {
        System.out.println(course);
    }
}