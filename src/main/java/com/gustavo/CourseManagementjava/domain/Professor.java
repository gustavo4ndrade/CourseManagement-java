package com.gustavo.CourseManagementjava.domain;

import com.gustavo.CourseManagementjava.domain.key.ProfessorNaturalKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private ProfessorNaturalKey naturalKey = new ProfessorNaturalKey();

    @Column(name = "registration_date", nullable = false)
    private LocalDateTime registration_date;

    @Column(name = "last_update_date", nullable = false)
    private LocalDateTime lastUpdateDate;
}