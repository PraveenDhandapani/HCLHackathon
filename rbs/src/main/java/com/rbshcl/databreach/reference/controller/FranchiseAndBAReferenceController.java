package com.rbshcl.databreach.reference.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.rbshcl.databreach.reference.repository.FranchiseAndBARepository;
import com.rbshcl.databreach.reference.response.FranchiseAndBADetails;

@Controller
public class FranchiseAndBAReferenceController {

	@Autowired
	FranchiseAndBARepository repository;
	
	@GetMapping("/franchise-ba-details")
	public FranchiseAndBADetails getFranchiseAndBADetails() {
		return null;
	}
}
