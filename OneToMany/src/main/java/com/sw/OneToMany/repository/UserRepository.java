package com.sw.OneToMany.repository;


import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
	
import com.sw.OneToMany.model.User;
import com.sw.OneToMany.model.UserAddress;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
//	@Query(value =" select * from userinfo inner join useradd on userinfo.id=useradd.userid where id=101;", 
//			nativeQuery=true)
//	  List<User> findAll();
//	
//	@Query(value = "SELECT * FROM userinfo u WHERE u.id = 101", 
//			  nativeQuery = true)
//    List<User> findById();
//	
//	@Query(value="SELECT a FROM userinfo a WHERE name = ?102",nativeQuery = true)
//    List<User> findByFirstNameAndLastName(String name);
//

	List<User> findByName(String name);
	List<User> findByNameAndEmail(String name, String email);

	UserAddress save(UserAddress userAddress);

}
