package com.gustavo.CourseManagementjava.rest.resource;

import com.gustavo.CourseManagementjava.dto.CourseDTO;
import com.gustavo.CourseManagementjava.service.impl.CourseDTOServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("api/course")
public class CourseDTOResource {
    @Inject
    CourseDTOServiceImpl courseDTOService;

    @RequestMapping(value = "listAll", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Object[]> getAll(){
        return new ResponseEntity<>(courseDTOService.getAllCourses().toArray(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> create(@RequestBody CourseDTO courseDTO){
        return new ResponseEntity<>(courseDTOService.addCourse(courseDTO), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getById(@PathVariable Long id){
        CourseDTO courseDTO = courseDTOService.getsById(id);
        return new ResponseEntity<>(courseDTO, courseDTO == null? HttpStatus.NO_CONTENT: HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody CourseDTO courseDTO){
        return new ResponseEntity<>(courseDTOService.update(courseDTO), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> delete(@PathVariable Long id){
        try{
            courseDTOService.delete(id);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
