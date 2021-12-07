package com.scrunch.ManytoOne.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scrunch.ManytoOne.model.User;
import com.scrunch.ManytoOne.model.UserProfile;
import com.scrunch.ManytoOne.repository.UserProfileRepository;
import com.scrunch.ManytoOne.repository.UserRepository;

@Service
public class UserService {
	

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserProfileRepository userProfileRepository;
	
	public User changeEmail(String mail, Long id) {
		Optional<User> savedUser = userRepository.findById(id);
		System.out.println(id);
		if (savedUser.isEmpty()) {
		System.err.println("Not found for ID: " + id);
		return null;
	} else {
		savedUser.get().setEmail(mail);
		return userRepository.save(savedUser.get());
	}
	}


	public Iterable<User> fetchAllRecords() {
		return userRepository.findAll();
		}



		public Iterable<UserProfile> manyToOneEx() {
		return userProfileRepository.findAll();
		}



		public Optional<UserProfile> findbyid(Integer id) {
		return userProfileRepository.findById(id);



		}



		public UserProfile createUserProfile(UserProfile UserProfile) {
		return userProfileRepository.save(UserProfile);
		}



		public Iterable<UserProfile> fetchAllRecords1() {
		return userProfileRepository.findAll();
		}



		public User createUser(User user) {
		return userRepository.save(user);
		}



		public Iterable<User> deleteEmail(Long id) {
		Optional<User> user = userRepository.findById(id);
		System.out.println(user);
		userRepository.deleteById(id);
		return fetchAllRecords();
		}



		public List<User> findSimilarRecords(String name) {
		return userRepository.findByName(name);
		}



		public List<User> findSimilarRecords(String name, String email) {
		System.out.println("name: " + name + " - email: " + email);
		return userRepository.findByNameAndEmail(name, email);
		}



		public List<UserProfile> insertaddr(List<UserProfile> UserProfile, Integer id) {
		userProfileRepository.saveAll(UserProfile);
		return userProfileRepository.findAll();



		}



		public List<User> getdetails() {
		return userRepository.findAll();
		}
		}