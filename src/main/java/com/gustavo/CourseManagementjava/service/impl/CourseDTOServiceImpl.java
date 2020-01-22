package com.gustavo.CourseManagementjava.service.impl;

import com.gustavo.CourseManagementjava.domain.Course;
import com.gustavo.CourseManagementjava.dto.CourseDTO;
import com.gustavo.CourseManagementjava.repository.CourseRepository;
import com.gustavo.CourseManagementjava.service.AbstractDTOServiceAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
@Primary
public class CourseDTOServiceImpl extends AbstractDTOServiceAdapter<Course, CourseDTO> {
    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public CourseDTO addCourse(CourseDTO courseDTO)  {
        LocalDateTime localDateTime = LocalDateTime.parse(LocalDateTime.now().toString());
        courseDTO.setCreationDate(localDateTime);
        courseDTO.setLastUpdateDate(localDateTime);

        return this.save(courseDTO);
    }

    public CourseDTO getsById(Long id)  {
        return this.findOneById(id);
    }

    public CourseDTO update(CourseDTO courseDTO)  {
        LocalDateTime localDateTime = LocalDateTime.parse(LocalDateTime.now().toString());
        courseDTO.setLastUpdateDate(localDateTime);

        return this.save(courseDTO);
    }

    public void delete(Long id){
        courseRepository.deleteById(id);
    }

}
