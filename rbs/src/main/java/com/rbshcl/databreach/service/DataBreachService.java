package com.rbshcl.databreach.service;

import java.util.List;

import com.rbshcl.databreach.model.DataBreachDetails;

public interface DataBreachService {

	public List<DataBreachDetails> getAllDataBreachDetailsByRisk(String riskProfile);
	
	public DataBreachDetails saveDataBreachDetails(DataBreachDetails breachDetails);
}
