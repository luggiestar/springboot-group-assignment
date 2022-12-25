package com.example.project2.course;

public class Course {
    private Long id;
    private String code;
    private String name;

    public Course() {
    }

    public Course(Long id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
