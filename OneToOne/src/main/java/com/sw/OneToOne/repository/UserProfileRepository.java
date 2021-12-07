package com.sw.OneToOne.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sw.OneToOne.model.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long>{

}
