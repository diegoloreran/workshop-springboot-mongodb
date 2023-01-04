package com.diegoloreran.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.diegoloreran.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {
	
	@Query("{'Title': { $regex: ?0, $options: 'i'}}")
	List<Post> searchTitle(String text);
	
	List<Post> findByTitleContainingIgnoreCase(String text);
	
}