package com.samco.mdbspringbootdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.samco.mdbspringbootdemo.model.User;
@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
