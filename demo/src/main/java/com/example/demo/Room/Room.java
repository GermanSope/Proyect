package com.example.demo.Room;

import java.util.Date;

public class Room {
	
	private Long id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private String nationality;
	
	@SuppressWarnings("unused")
	private Long getId() {
		return id;
	}
	
	@SuppressWarnings("unused")
	private void setId(Long id) {
		this.id = id;
	}
	
	@SuppressWarnings("unused")
	private String getEmail() {
		return email;
	}
	
	@SuppressWarnings("unused")
	private void setEmail(String email) {
		this.email = email;
	}

	@SuppressWarnings("unused")
	private String getPassword() {
		return password;
	}

	@SuppressWarnings("unused")
	private void setPassword(String password) {
		this.password = password;
	}

	@SuppressWarnings("unused")
	private String getFirstName() {
		return firstName;
	}

	@SuppressWarnings("unused")
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
}

