package com.gustavo.CourseManagementjava.domain.key;

import javax.persistence.Column;

public class PersonNaturalKey {
    @Column(name = "identification", unique = true, nullable = false)
    private String identification;
}
