package dev.patika.app.entity.dto;

import dev.patika.app.entity.concretes.Course;

import java.util.List;

public class VisitingResearcherDto {
    private String fullName;
    private String address;
    private String phoneNumber;
    private List<Course> courses;
    private double hourlySalary;
}
