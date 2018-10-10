package com.zhengshi.mongo.repository;

import com.zhengshi.mongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User,Long> {
    List<User> findByFirstName(String firstName);
    List<User> findByLastName(String LastName);
    User findByEmail(String email);
}
