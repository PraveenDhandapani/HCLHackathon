package com.rbshcl.databreach.reference.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rbshcl.databreach.model.AuditEntity;

@Entity
@Table(name="BSNSS_AREA_RFRNC")
public class BusinessAreaReference extends AuditEntity {

	@Column(name="BSNSS_AREA_ID")
	private Long businessAreaId;
	
	@Column(name="BSNSS_AREA_NM")
	private String businessArea;

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
	
	
	
}
