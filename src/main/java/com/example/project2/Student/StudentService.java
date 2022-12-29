package com.example.project2.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return this.studentRepository.findAll();
    }

    public void saveStudent(Student student) {
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if(studentByEmail.isPresent()) {
            throw new IllegalStateException("Email exist");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        boolean student = studentRepository.existsById(studentId);
        if (!student) {
            throw new IllegalStateException("No student with the given id: "+studentId);
        }

        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(String name, String email, Long studentId) {

        Student student = studentRepository.findById(studentId).orElseThrow(
                () -> new IllegalStateException("Student with id "+studentId+" not exist")
        );

        if(name != null && name.length() > 0 && !Objects.equals(student.getName(), name)) {
            student.setName(name);
        }

        if(email != null && email.length() > 0 && !Objects.equals(student.getEmail(), email)) {
            Optional<Student> emailExist = studentRepository.findStudentByEmail(email);
            if (emailExist.isPresent()) {
                throw new IllegalStateException("Student with email "+email+" exist");
            }
            else {
                student.setEmail(email);
            }
        }

    }
}
