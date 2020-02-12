package com.gustavo.CourseManagementjava.domain;

import com.gustavo.CourseManagementjava.domain.key.StudentNaturalKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Embedded
    private StudentNaturalKey naturalKey = new StudentNaturalKey();

    @Column(name = "registration_date", nullable = false)
    private LocalDateTime registration_date;

    @Column(name = "last_update_date", nullable = false)
    private LocalDateTime lastUpdateDate;
}
