package com.rbshcl.databreach.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hackathon.rbs.repository.DataBreachRepository;
import com.hackathon.rbs.service.DataBreachService;
import com.rbshcl.databreach.model.DataBreachDetails;

@Controller
public class DataBreachController {

	@Autowired
	DataBreachRepository repo;
	
	@Autowired
	DataBreachService service;
	
	@GetMapping("/data-breach-details")
	public List<DataBreachDetails> getAllDetails()
	{
		return repo.findAll();
	
	}
	
	@GetMapping("/{riskProfile}/data-breach-details") 
	public List<DataBreachDetails> getDataBreachDetailsByRisk(String riskProfile) {
		return service.getAllDataBreachDetailsByRisk(riskProfile);
	}
	
	@RequestMapping(value="/data-breach-details", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public @ResponseBody DataBreachDetails saveBreachDetails(@RequestBody DataBreachDetails breachDetails) {
		return service.saveDataBreachDetails(breachDetails);
	}
}
