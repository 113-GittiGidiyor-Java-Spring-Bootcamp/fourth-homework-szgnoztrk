package dev.patika.app.entity.dto;

import dev.patika.app.entity.concretes.Course;

import java.time.LocalDate;
import java.util.List;

public class StudentDto {
    private String fullName;
    private LocalDate birthDate;
    private String address;
    private String gender;
    private List<Course> courses;
}
