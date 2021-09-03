package dev.patika.app.entity.dto;

import dev.patika.app.entity.concretes.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitingResearcherDto {
    private String fullName;
    private String address;
    private String phoneNumber;
    private List<Course> courses;
    private double hourlySalary;
}
