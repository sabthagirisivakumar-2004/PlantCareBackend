package com.example.plantcare.userlogin;



import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
    // Custom query methods can be defined here if needed
}