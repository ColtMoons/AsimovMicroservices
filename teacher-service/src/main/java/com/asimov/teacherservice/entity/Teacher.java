package com.asimov.teacherservice.entity;

import com.asimov.teacherservice.model.Course;
import com.asimov.teacherservice.model.Director;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Data @Builder
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int point;

    @NotEmpty
    @NotBlank
    private String first_name;

    @NotEmpty
    @NotBlank
    private String last_name;

    private int age;

    private String password;

    private String phone;

    @Column(name = "director_id")
    private Long directorId;

    @Transient
    private Director director;

    @Transient
    private List<Course> courses;
}
