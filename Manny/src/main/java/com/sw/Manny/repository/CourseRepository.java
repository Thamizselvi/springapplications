package com.sw.Manny.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sw.Manny.model.Course;

@Repository

public interface CourseRepository extends JpaRepository<Course,Long>{

	
}