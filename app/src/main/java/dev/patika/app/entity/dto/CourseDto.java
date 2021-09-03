package dev.patika.app.entity.dto;

import dev.patika.app.entity.concretes.Instructor;
import dev.patika.app.entity.concretes.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto {
    private int id;
    private String name;
    private String code;
    private int creditScore;
    List<Student> students;
    Instructor instructor;
}
