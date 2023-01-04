package com.diegoloreran.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.diegoloreran.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {
	
}