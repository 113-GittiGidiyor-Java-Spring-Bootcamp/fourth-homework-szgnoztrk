package dev.patika.app.core.mapper;

import dev.patika.app.entity.concretes.PermanentInstructor;
import dev.patika.app.entity.dto.PermanentInstructorDto;
import org.mapstruct.Mapper;

@Mapper
public interface PermanentInstructorMapper {
    PermanentInstructor mapFromPermanentInstructorDTOToPermanentInstructor(PermanentInstructorDto permanentInstructorDto);
    PermanentInstructorDto mapFromPermanentInstructorToPermanentInstructorDTO(PermanentInstructor permanentInstructor);
}
