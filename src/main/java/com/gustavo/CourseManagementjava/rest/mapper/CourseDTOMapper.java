package com.gustavo.CourseManagementjava.rest.mapper;

import com.gustavo.CourseManagementjava.domain.Course;
import com.gustavo.CourseManagementjava.dto.CourseDTO;
import org.springframework.stereotype.Component;

@Component
public class CourseDTOMapper implements IDTOMapper<Course, CourseDTO> {
    @Override
    public Course toDomain(CourseDTO dto) {
        Course domain = new Course();

        domain.setId(dto.getId());
        domain.setLastUpdateDate(dto.getLastUpdateDate());
        domain.setDescription(dto.getDescription());
        domain.setCreationDate(dto.getCreationDate());
        domain.setName(dto.getName());

        return domain;
    }

    @Override
    public CourseDTO toDTO(Course domain) {
        CourseDTO dto = new CourseDTO();

        dto.setCreationDate(domain.getCreationDate());
        dto.setId(domain.getId());
        dto.setLastUpdateDate(domain.getLastUpdateDate());
        dto.setDescription(domain.getDescription());
        dto.setName(domain.getName());

        return dto;
    }
}
