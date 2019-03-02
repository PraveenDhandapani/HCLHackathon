package com.hackathon.rbs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.rbshcl.databreach.model.AuditEntity;

@Entity
@Table(name="FRNCHS_RFRNC")
public class FranchiseReferenceDetails extends AuditEntity {

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
