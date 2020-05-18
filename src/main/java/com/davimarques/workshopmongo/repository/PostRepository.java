package com.davimarques.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.davimarques.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
