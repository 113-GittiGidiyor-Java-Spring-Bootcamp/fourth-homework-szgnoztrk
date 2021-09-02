package dev.patika.app.core.mapper;

import dev.patika.app.entity.concretes.Course;
import dev.patika.app.entity.dto.CourseDto;
import org.mapstruct.Mapper;

@Mapper
public interface CourseMapper {
    Course mapFromCourseDTOToCourse(CourseDto courseDto);
    CourseDto mapFromCourseToCourseDTO(Course course);
}
