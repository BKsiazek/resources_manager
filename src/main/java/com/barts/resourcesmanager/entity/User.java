package com.barts.resourcesmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private long id;
	
	private String role;
	
	@Column(nullable = false, unique = true)
	private String username;
	
	private String firstName;
	
	private String lastName;
	
	private String password;
	//private Date employmentDate;
	//private List<Appointment> appointments;

	protected User() {
		
	}
	
	public User(String role, String username, String firstName, String lastName, String password/*, Date employmentDate,
			List<Appointment> appointments*/) {
		super();
		this.role = role;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		//this.employmentDate = employmentDate;
		//this.appointments = appointments;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public String getRole() {
		return role;
	}
	
	public String getUsername() {
		return username;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", role=" + role + ", username=" + username + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", password=" + password + "]";
	}

//	public Date getEmploymentDate() {
//		return employmentDate;
//	}
//
//	public List<Appointment> getAppointments() {
//		return appointments;
//	}
	
}
