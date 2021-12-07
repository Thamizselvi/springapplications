package com.scrunch.ManytoOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scrunch.ManytoOne.model.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile,Integer> {

}
