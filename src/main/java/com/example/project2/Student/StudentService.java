package com.example.project2.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Lugano",
                        LocalDate.of(2000, Month.JANUARY, 21),
                        "luggie@gmail.com",
                        21
                )
        );
    }
}
