package com.hackathon.rbs.model;

import javax.persistence.Entity;


@Entity
public class ImpactedAccountLocation extends AuditEntity {

	private Long dataBreachId;
	
	private String location;

	public Long getDataBreachId() {
		return dataBreachId;
	}

	public void setDataBreachId(Long dataBreachId) {
		this.dataBreachId = dataBreachId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
