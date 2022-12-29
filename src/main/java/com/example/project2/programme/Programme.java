package com.example.project2.programme;

import javax.persistence.*;

@Entity
@Table
public class Programme {

    @Id
    @SequenceGenerator(
            name = "programme_sequence",
            sequenceName = "programme_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "programme_sequence"
    )
    private Long id;
    private String name;

    public Programme() {}

    public Programme(String name) {
        this.name = name;
    }
    public Programme(Long id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Programme{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
