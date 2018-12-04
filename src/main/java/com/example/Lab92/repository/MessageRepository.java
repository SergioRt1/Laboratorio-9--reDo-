package com.example.Lab92.repository;

import com.example.Lab92.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message, String> {

}
