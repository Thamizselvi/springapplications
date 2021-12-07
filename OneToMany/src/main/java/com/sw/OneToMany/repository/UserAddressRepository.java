package com.sw.OneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sw.OneToMany.model.UserAddress;

@Repository
public interface UserAddressRepository extends JpaRepository<UserAddress,Integer> {

}
