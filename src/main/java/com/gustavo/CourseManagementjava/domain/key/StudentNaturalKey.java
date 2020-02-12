package com.gustavo.CourseManagementjava.domain.key;

import com.gustavo.CourseManagementjava.domain.Person;

import javax.persistence.Column;
import javax.persistence.MapsId;

public class StudentNaturalKey {
    @MapsId
    @Column(name = "student_person", unique = true, nullable = false)
    private Person person;

    @Column(name = "identification", unique = true, nullable = false)
    private String identification;
}
