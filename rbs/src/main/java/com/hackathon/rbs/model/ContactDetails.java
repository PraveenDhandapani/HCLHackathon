package com.hackathon.rbs.model;

import javax.persistence.Entity;

@Entity
public class ContactDetails extends AuditEntity {
	
	private String fullName;
	
	private Long Age;
	
	private String gender;
	
	private String maritalStatus;
	
	private String dependent;
	
	private String nextOfKin;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Long getAge() {
		return Age;
	}

	public void setAge(Long age) {
		Age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getDependent() {
		return dependent;
	}

	public void setDependent(String dependent) {
		this.dependent = dependent;
	}

	public String getNextOfKin() {
		return nextOfKin;
	}

	public void setNextOfKin(String nextOfKin) {
		this.nextOfKin = nextOfKin;
	}
	
	
}
