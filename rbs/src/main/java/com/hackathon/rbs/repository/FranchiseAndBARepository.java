package com.hackathon.rbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.rbs.model.FranchiseReferenceDetails;

@Repository
public interface FranchiseAndBARepository extends JpaRepository<FranchiseReferenceDetails, Long>{


	
}
