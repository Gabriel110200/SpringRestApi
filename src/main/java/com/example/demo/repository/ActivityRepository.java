package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Activity;

public interface ActivityRepository extends JpaRepository<Activity,Long> {
	
	@Query("SELECT a FROM Activity a WHERE a.user.id = :userId")
	Activity GetUserActivity(@Param("userId") Long userId);

}
