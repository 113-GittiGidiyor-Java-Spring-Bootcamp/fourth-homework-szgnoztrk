package dev.patika.app.entity.dto;

import dev.patika.app.entity.concretes.Instructor;
import dev.patika.app.entity.concretes.Student;

import java.util.List;

public class CourseDto {
    private int id;
    private String name;
    private String code;
    private int creditScore;
    List<Student> students;
    Instructor instructor;
}
