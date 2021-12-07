package com.sw.OneToOne.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sw.OneToOne.model.User;



@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	List<User> findByName(String name);

	List<User> findByNameAndEmail(String name, String email);

}
