package com.oto.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oto.onetoone.model.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {

}
