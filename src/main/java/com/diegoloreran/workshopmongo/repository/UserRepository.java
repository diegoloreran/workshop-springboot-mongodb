package com.diegoloreran.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.diegoloreran.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
	
}