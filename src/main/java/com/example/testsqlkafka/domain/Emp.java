package com.example.testsqlkafka.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {

	@Id
	private String id;
	private String email;
	private String fullName;
	private String managerEmail;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getManagerEmail() {
		return managerEmail;
	}
	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}
	public Emp(String id, String email, String fullName, String managerEmail) {
		super();
		this.id = id;
		this.email = email;
		this.fullName = fullName;
		this.managerEmail = managerEmail;
	}
	public Emp() {
		super();
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", email=" + email + ", fullName=" + fullName + ", managerEmail=" + managerEmail + "]";
	}
	
	

	// getters and setters omitted for brevity
}
