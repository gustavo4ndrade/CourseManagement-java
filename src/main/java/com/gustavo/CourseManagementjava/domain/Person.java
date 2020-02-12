package com.gustavo.CourseManagementjava.domain;

import com.gustavo.CourseManagementjava.domain.key.PersonNaturalKey;
import com.gustavo.CourseManagementjava.domain.key.ProfessorNaturalKey;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class Person {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Embedded
    private PersonNaturalKey naturalKey = new PersonNaturalKey();

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "creation_date", nullable = false)
    private LocalDateTime creationDate;

    @Column(name = "last_update_date", nullable = false)
    private LocalDateTime lastUpdateDate;
}
