package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;



@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	@Query("SELECT new com.example.demo.model.User(u.id, u.mail) FROM User u")
	List<User> findAllUsers();

	
}
