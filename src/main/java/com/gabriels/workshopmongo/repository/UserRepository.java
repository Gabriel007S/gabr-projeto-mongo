package com.gabriels.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gabriels.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User,String>{

}
