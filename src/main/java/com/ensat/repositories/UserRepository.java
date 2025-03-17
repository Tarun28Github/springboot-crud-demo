package com.ensat.repositories;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.bson.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ensat.entities.User;



public interface UserRepository extends MongoRepository<User, Long> {
	

}
