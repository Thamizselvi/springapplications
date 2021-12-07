package com.oto.onetoone.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.oto.onetoone.model.User;
import com.oto.onetoone.model.UserProfile;
import com.oto.onetoone.service.UserService;

public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/beat")
	public String ping() {
		return LocalDate.now().toString();
	}
	// Changing email
	@PostMapping("/change-email/{id}")
	public User requestChangeEmail(@RequestBody String mail, @PathVariable Long id) {
	return userService.changeEmail(mail, id);
	}



	// Fetch all data from database
	@GetMapping("/base")
	public Iterable<User> fecthAll() {
	return userService.fetchAllRecords();
	}



	// Display One to one table values
	@GetMapping("/base1")
	public Iterable<UserProfile> fetchAll() {
	return userService.manyToOneEx();
	}



	// Fetch particular Data from UserProfile table
	@GetMapping("/base1-displayid/{id}")
	public Optional<UserProfile> displayALl(@PathVariable Long id) {
	return userService.findbyid(id);
	}



	// Insert User table
	@PostMapping("/create-user")
	public User createuser(@RequestBody User user) {
	return userService.createUser(user);
	}



	// insert UserProfile table
	@PostMapping("/address/{id}")
	public List<UserProfile> inserts(@RequestBody List<UserProfile> UserProfile, @PathVariable Integer id) {
	return userService.insertaddr(UserProfile, id);
	}



	// Delete method
	@DeleteMapping("/delete-email/{id}")
	public void DeleEmail(@PathVariable(value = "id") Long id) {
	userService.deleteEmail(id);
	}



	// fetching similar records
	@GetMapping("/similar-records/{name}")
	public List<User> fetchSimlarRecordsByName(@PathVariable String name) {
	return userService.findSimilarRecords(name);
	}



	// fetching similar records name and email
	@PostMapping("/similar-records-email/{name}")
	public List<User> fetchSimlarRecordsByName(@PathVariable String name, @RequestBody String email) {
	return userService.findSimilarRecords(name, email);
	}

	//Query
	@GetMapping("/query")
	public List<User> getAllRecords(){
	return userService.getdetails();
	}



	
}
