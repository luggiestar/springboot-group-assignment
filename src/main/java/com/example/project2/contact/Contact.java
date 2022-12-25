package com.example.project2.contact;

public class Contact {
    private Long id;
    private String name;

    private String number;

    public Contact() {
    }

    public Contact(Long id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
