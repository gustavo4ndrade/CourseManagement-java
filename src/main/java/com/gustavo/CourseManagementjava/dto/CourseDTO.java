package com.gustavo.CourseManagementjava.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseDTO implements IDTO{
    Long id;
    String name;
    String description;
    LocalDateTime creationDate;
    LocalDateTime lastUpdateDate;
    List<ProfessorDTO> professors;
}
