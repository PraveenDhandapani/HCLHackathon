package com.rbshcl.databreach.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.rbshcl.databreach.model.DataBreachDetails;
import com.rbshcl.databreach.repository.DataBreachRepository;

@Controller
public class DataBreachController {

	@Autowired
	DataBreachRepository repo;
	
	@GetMapping("/data-breach-details")
	public List<DataBreachDetails> getAllDetails()
	{
		return repo.findAll();
	
	}
	
	@GetMapping("/{riskProfile}/data-breach-details") 
	public List<DataBreachDetails> getDataBreachDetailsByRisk(String riskProfile) {
		return repo.getAllDataBreachesByRisk(riskProfile);
	}
}
