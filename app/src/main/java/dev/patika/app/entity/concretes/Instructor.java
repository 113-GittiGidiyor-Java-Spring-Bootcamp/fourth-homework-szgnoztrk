package dev.patika.app.entity.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Builder
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "instructors")
public class Instructor extends BaseEntity {

    @Column(name = "instructor_fullname")
    private String fullName;

    @Column(name = "instructor_address")
    private String address;

    @Column(name = "instructor_phone")
    private String phoneNumber;

    @JsonManagedReference
    @OneToMany(mappedBy = "instructor")
    private List<Course> courses;
}
