package com.rbshcl.databreach.model;

import java.sql.Date;

import javax.persistence.Column;

public class AuditEntity {

	@Column(name="CR_DT")
	private Date createdDate;
	
	@Column(name="CR_BY")
	private String createdBy;

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	
	
	
}
