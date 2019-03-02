package com.rbshcl.databreach.reference.response;

import java.util.List;

import com.rbshcl.databreach.reference.model.BusinessAreaReference;
import com.rbshcl.databreach.reference.model.FranchiseReferenceDetails;

public class FranchiseAndBADetails {

	private FranchiseReferenceDetails franchises;
	
	private List<BusinessAreaReference> baDetails;

	public FranchiseReferenceDetails getFranchises() {
		return franchises;
	}

	public void setFranchises(FranchiseReferenceDetails franchises) {
		this.franchises = franchises;
	}

	public List<BusinessAreaReference> getBaDetails() {
		return baDetails;
	}

	public void setBaDetails(List<BusinessAreaReference> baDetails) {
		this.baDetails = baDetails;
	}
	
	
}
