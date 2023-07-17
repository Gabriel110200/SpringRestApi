package com.example.demo.model;


import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "usuario")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String mail;
	
	@Column(nullable = false)
	private String password;
	
	
	
	public User() {
		// Default constructor
	}
	
	public User(Long id, String mail) {
	    this.id = id;
	    this.mail = mail;
	}

	public User(String mail, String password) {
		this.mail = mail;
		this.password = password;
	}

	// Getters and setters
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	// hashCode(), equals() methods, and other methods if any
}

