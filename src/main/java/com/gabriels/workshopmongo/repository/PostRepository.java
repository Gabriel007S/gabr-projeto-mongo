package com.gabriels.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gabriels.workshopmongo.Post;

@Repository
public interface PostRepository extends MongoRepository<Post,String>{

}
