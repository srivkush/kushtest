package com.nttdata.test.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nttdata.test.model.Greetings;

@RepositoryRestResource(collectionResourceRel = "greetings", path = "greetings")
public interface GreetingRepository extends MongoRepository<Greetings, ObjectId>{

}
