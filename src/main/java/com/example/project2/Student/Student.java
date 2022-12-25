package com.example.project2.Student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private LocalDate dob;
    private String Email;
    private int age;

    public Student() {
    }

    public Student(Long id, String name, LocalDate dob, String email, int age) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        Email = email;
        this.age = age;
    }

    public Student(String name, LocalDate dob, String email, int age) {
        this.name = name;
        this.dob = dob;
        Email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", Email='" + Email + '\'' +
                ", age=" + age +
                '}';
    }
}
