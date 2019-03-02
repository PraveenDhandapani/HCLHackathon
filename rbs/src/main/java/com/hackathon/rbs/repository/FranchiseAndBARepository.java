package com.hackathon.rbs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hackathon.rbs.model.FranchiseReferenceDetails;

@Repository
public interface FranchiseAndBARepository extends JpaRepository<FranchiseReferenceDetails, Long>{

	@Query("SELECT f from FranchiseReferenceDetails")
    List<FranchiseReferenceDetails> findAll();
 
	
}
