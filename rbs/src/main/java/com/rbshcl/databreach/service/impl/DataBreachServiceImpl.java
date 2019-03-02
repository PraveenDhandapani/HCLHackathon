package com.rbshcl.databreach.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbshcl.databreach.model.DataBreachDetails;
import com.rbshcl.databreach.repository.DataBreachRepository;
import com.rbshcl.databreach.service.DataBreachService;

@Service
public class DataBreachServiceImpl implements DataBreachService{
	
	@Autowired
	DataBreachRepository repo;

	public List<DataBreachDetails> getAllDataBreachDetailsByRisk(String riskProfile) {
		return repo.getAllDataBreachesByRisk(riskProfile);
	}
	
}
