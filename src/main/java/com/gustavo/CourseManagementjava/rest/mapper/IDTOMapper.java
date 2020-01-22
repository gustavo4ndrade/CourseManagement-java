package com.gustavo.CourseManagementjava.rest.mapper;

public interface IDTOMapper<DOMAIN, DTO> {
    DOMAIN toDomain(DTO dto);
    DTO toDTO(DOMAIN domain);
}
