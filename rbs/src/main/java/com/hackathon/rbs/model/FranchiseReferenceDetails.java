package com.hackathon.rbs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FRNCHS_RFRNC")
public class FranchiseReferenceDetails {

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFranchiseName() {
		return franchiseName;
	}

	public void setFranchiseName(String franchiseName) {
		this.franchiseName = franchiseName;
	}

	@Id
	@Column(name="FRNCHS_ID")
	private Long id;
	
	@Column(name="FRNCHS_NM")
	private String franchiseName;
	
	
}
