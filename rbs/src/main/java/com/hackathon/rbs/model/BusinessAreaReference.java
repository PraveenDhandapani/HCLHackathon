package com.hackathon.rbs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BSNSS_AREA_RFRNC")
public class BusinessAreaReference {

	@Id
	@Column(name="BSNSS_AREA_ID")
	private Long businessAreaId;
	
	@Column(name="BSNSS_AREA_NM")
	private String businessArea;
	
	@Column(name="FRNCHS_ID")
	private Long franchiseId;
	
	public Long getBusinessAreaId() {
		return businessAreaId;
	}

	public void setBusinessAreaId(Long businessAreaId) {
		this.businessAreaId = businessAreaId;
	}

	public String getBusinessArea() {
		return businessArea;
	}

	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}

	public Long getFranchiseId() {
		return franchiseId;
	}

	public void setFranchiseId(Long franchiseId) {
		this.franchiseId = franchiseId;
	}
	
	
	
}
