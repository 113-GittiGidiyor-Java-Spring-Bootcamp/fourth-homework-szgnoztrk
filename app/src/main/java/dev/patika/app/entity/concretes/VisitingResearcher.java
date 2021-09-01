package dev.patika.app.entity.concretes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "visiting_researchers")
public class VisitingResearcher extends Instructor {
    @Column(name = "hourly_salary")
    private double hourlySalary;

    @Builder(builderMethodName = "VisitingResearcherBuilder")
    public VisitingResearcher(int id, String fullName, String address, String phoneNumber, List<Course> courses, double hourlySalary) {
        super(id, fullName, address, phoneNumber, courses);
        this.hourlySalary = hourlySalary;
    }
}
