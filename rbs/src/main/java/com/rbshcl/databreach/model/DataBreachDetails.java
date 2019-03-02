package com.rbshcl.databreach.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class DataBreachDetails  extends AuditEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5303708023463341877L;

	@SequenceGenerator(name="SEQ",sequenceName="breachId",allocationSize=1)
	@GeneratedValue(generator="SEQ")
	@Id
	private Long id;
	
	private Long franchiseId;
	
	private Long businessAreaID;
	
	private String identifiedBy;
	
	private String supplier;
	
	private Boolean madeAware;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFranchiseId() {
		return franchiseId;
	}

	public void setFranchiseId(Long franchiseId) {
		this.franchiseId = franchiseId;
	}

	public Long getBusinessAreaID() {
		return businessAreaID;
	}

	public void setBusinessAreaID(Long businessAreaID) {
		this.businessAreaID = businessAreaID;
	}

	public String getIdentifiedBy() {
		return identifiedBy;
	}

	public void setIdentifiedBy(String identifiedBy) {
		this.identifiedBy = identifiedBy;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public Boolean getMadeAware() {
		return madeAware;
	}

	public void setMadeAware(Boolean madeAware) {
		this.madeAware = madeAware;
	}

	public String getBreachCategory() {
		return breachCategory;
	}

	public void setBreachCategory(String breachCategory) {
		this.breachCategory = breachCategory;
	}

	public Boolean getIsYourBusinessArea() {
		return isYourBusinessArea;
	}

	public void setIsYourBusinessArea(Boolean isYourBusinessArea) {
		this.isYourBusinessArea = isYourBusinessArea;
	}

	public String getCauseFranchise() {
		return causeFranchise;
	}

	public void setCauseFranchise(String causeFranchise) {
		this.causeFranchise = causeFranchise;
	}

	public String getCauseBusiness() {
		return causeBusiness;
	}

	public void setCauseBusiness(String causeBusiness) {
		this.causeBusiness = causeBusiness;
	}

	public String getImpactedAccountLocation() {
		return impactedAccountLocation;
	}

	public void setImpactedAccountLocation(String impactedAccountLocation) {
		this.impactedAccountLocation = impactedAccountLocation;
	}

	public String getInfoCompromised() {
		return infoCompromised;
	}

	public void setInfoCompromised(String infoCompromised) {
		this.infoCompromised = infoCompromised;
	}

	public String getRiskProfile() {
		return riskProfile;
	}

	public void setRiskProfile(String riskProfile) {
		this.riskProfile = riskProfile;
	}

	private String breachCategory;
	
	private Boolean isYourBusinessArea;
	
	private String causeFranchise;
	
	private String causeBusiness;
	
	private String impactedAccountLocation;
	
	private String infoCompromised;
	
	private String riskProfile;
	
	
	
	
}
