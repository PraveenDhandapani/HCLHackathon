package com.hackathon.rbs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.rbs.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
