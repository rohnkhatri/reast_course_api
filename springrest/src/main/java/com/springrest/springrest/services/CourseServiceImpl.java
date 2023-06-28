package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseDao courseDao;

//	List<Course> list;
	
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145,"Java Core Course", "This course contains basics of java" ));
//		list.add(new Course(146 , "Spring Boot Course", "Creating Rest API using Spring Boot"));
	}
	
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}


	@Override
	public Course getCourse(long courseId) {
//		Course c = null;
//		
//		for(Course course: list) {
//			if(course.getId() == courseId) {
//				c = course;
//			}
//		}
		return courseDao.getOne(courseId);
	}


	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		return courseDao.save(course);
	}


	@Override
	public Course updateCourse(Course course) {
//		Course course = getCourse(courseId);
//		course.setId(updatedCourse.getId());
//		course.setTitle(updatedCourse.getTitle());
//	    course.setDescription(updatedCourse.getDescription());
		
		courseDao.save(course);
		return course;
	}


	@Override
	public void deleteCourse(long courseId) {
//		list.remove(getCourse(courseId));
//		return "Deleted Successfully";
		Course entitiy = courseDao.getOne(courseId);
		courseDao.delete(entitiy);
	}
	
	

}
