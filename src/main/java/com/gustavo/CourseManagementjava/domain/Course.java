package com.gustavo.CourseManagementjava.domain;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String description;

	@Column(name = "creation_date")
	private LocalDateTime creationDate;

	@Column(name = "last_update_date")
	private LocalDateTime lastUpdateDate;
}
