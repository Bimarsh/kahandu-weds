package com.kahandu.weds.repository;

import com.kahandu.weds.domain.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;

import java.math.BigInteger;

public interface UserRepository extends MongoRepository<User, String> {

    public User findByEmail(String email);
}
