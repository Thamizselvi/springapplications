package com.sw.Manny.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sw.Manny.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
