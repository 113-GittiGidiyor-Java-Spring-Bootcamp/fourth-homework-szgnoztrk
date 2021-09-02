package dev.patika.app.entity.dto;

import dev.patika.app.entity.concretes.Course;

import java.util.List;

public class PermanentInstructorDto {
    private String fullName;
    private String address;
    private String phoneNumber;
    private List<Course> courses;
    private double fixedSalary;
}
