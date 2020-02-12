package com.gustavo.CourseManagementjava.domain.key;

import com.gustavo.CourseManagementjava.domain.Person;

import javax.persistence.Column;
import javax.persistence.MapsId;

public class ProfessorNaturalKey {
    @MapsId
    @Column(name = "professor_person", unique = true, nullable = false)
    private Person person;

    @Column(name = "identification", unique = true, nullable = false)
    private String identification;
}
