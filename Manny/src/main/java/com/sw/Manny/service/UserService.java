package com.sw.Manny.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw.Manny.model.Course;
import com.sw.Manny.model.Student;
import com.sw.Manny.repository.CourseRepository;
import com.sw.Manny.repository.StudentRepository;


@Service
public class UserService {

	@Autowired
	public CourseRepository courseRepository;
	
	@Autowired
	public StudentRepository studentRepository;
	
	
	public Iterable<Course> fetchAllRecords() {
		
		return courseRepository.findAll();
	}


	public Iterable<Course>deleteName(Long id) {
		Optional<Course> user = courseRepository.findById(id);
		System.out.println(user);
		courseRepository.deleteById(id);
		return fetchAllRecords();
		
	}


	public Iterable<Student> fetchAllsRecords() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	public Iterable<Course> fetchAllsRecord() {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}
	
}
