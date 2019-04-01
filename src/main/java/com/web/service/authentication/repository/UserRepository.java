package com.web.service.authentication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.web.service.authentication.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

  // @Query(value = "{ 'username' : ?0, 'password' : ?1 }")
  User findByUsernameAndPassword(String username, String password);
}
