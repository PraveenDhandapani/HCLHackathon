package com.hackathon.rbs.service;

import java.util.List;

import com.hackathon.rbs.model.DataBreachDetails;

public interface DataBreachService {

	public List<DataBreachDetails> getAllDataBreachDetailsByRisk(String riskProfile);
	
	public DataBreachDetails saveDataBreachDetails(DataBreachDetails breachDetails);
}
