package dev.patika.app.entity.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.patika.app.entity.abstracts.BaseEntity;
import dev.patika.app.entity.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "students")
public class Student extends BaseEntity {

    @Column(name = "student_fullname")
    private String fullName;

    @Column(name = "student_birthdate")
    private LocalDate birthDate;

    @Column(name = "student_address")
    private String address;

    @Column(name = "student_gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @JsonIgnore
    @ManyToMany
    private List<Course> courses;
}
