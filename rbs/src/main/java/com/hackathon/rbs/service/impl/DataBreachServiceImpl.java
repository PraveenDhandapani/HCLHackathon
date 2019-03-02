package com.hackathon.rbs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.rbs.model.DataBreachDetails;
import com.hackathon.rbs.repository.DataBreachRepository;
import com.hackathon.rbs.service.DataBreachService;

@Service
public class DataBreachServiceImpl implements DataBreachService{
	
	@Autowired
	DataBreachRepository repo;

	public List<DataBreachDetails> getAllDataBreachDetailsByRisk(String riskProfile) {
		return repo.getAllDataBreachesByRisk(riskProfile);
	}
	
	public DataBreachDetails saveDataBreachDetails(DataBreachDetails breachDetails) {
		return repo.saveAndFlush(breachDetails);
	}
	
}
