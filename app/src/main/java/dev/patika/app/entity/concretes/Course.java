package dev.patika.app.entity.concretes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import dev.patika.app.entity.abstracts.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "courses")
public class Course extends BaseEntity {

    @Column(name = "course_name")
    private String name;

    @Column(name = "course_code")
    private String code;

    @Column(name = "course_credit_score")
    private int creditScore;

    @ManyToMany(mappedBy = "courses")
    List<Student> students;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "instructor_id", referencedColumnName = "id")
    Instructor instructor;
}
