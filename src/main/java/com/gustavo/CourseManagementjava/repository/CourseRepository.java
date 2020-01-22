package com.gustavo.CourseManagementjava.repository;

import com.gustavo.CourseManagementjava.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends IRepository<Course> {
}
