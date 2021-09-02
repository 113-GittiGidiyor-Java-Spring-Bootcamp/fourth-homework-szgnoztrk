package dev.patika.app.core.mapper;

import dev.patika.app.entity.concretes.VisitingResearcher;
import dev.patika.app.entity.dto.VisitingResearcherDto;
import org.mapstruct.Mapper;

@Mapper
public interface VisitingResearcherMapper {
    VisitingResearcher mapFromVisitingInstructorDTOToVisitingInstructor(VisitingResearcherDto visitingResearcherDto);
    VisitingResearcherDto mapFromVisitingInstructorToVisitingInstructorDTO(VisitingResearcher visitingResearcher);
}
