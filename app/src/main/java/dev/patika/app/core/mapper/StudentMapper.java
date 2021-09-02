package dev.patika.app.core.mapper;

import dev.patika.app.entity.concretes.Student;
import dev.patika.app.entity.dto.StudentDto;
import org.mapstruct.Mapper;

@Mapper
public interface StudentMapper {
    Student mapFromStudentDTOToStudent(StudentDto studentDto);
    StudentDto mapFromStudentToStudentDTO(Student student);
}
