package com.sw.Manny.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sw.Manny.model.Course;
import com.sw.Manny.model.Student;
import com.sw.Manny.service.UserService;


@RestController

@RequestMapping("/check")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/beat")
	public String ping() {
		return LocalDate.now().toString();
	}
	
	@GetMapping("/base")
	public Iterable<Course> fecthAll() {
	return userService.fetchAllRecords();
	}
	
	@GetMapping("/base-student")
	public Iterable<Student> fecthAlls() {
	return userService.fetchAllsRecords();
	}
	
	@DeleteMapping("/delete-email/{id}")
	public void DeleName(@PathVariable(value = "id") Long id) {
	userService.deleteName(id);
	}

}
