package com.example.Lab92.persitence.impl;


import com.example.Lab92.model.Message;
import com.example.Lab92.persitence.MessagePersistece;
import com.example.Lab92.repository.MessageRepository;
import com.example.Lab92.services.MessageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoBDPersistence implements MessagePersistece {

    @Autowired
    MessageRepository repository;

    @Override
    public void saveMessage(Message message) throws MessageException {
        repository.save(message);
    }

    @Override
    public List<Message> getLastMessages() throws MessageException {

        List<Message> messages = repository.findAll(new Sort(Sort.Direction.DESC, "time"));
        return messages.subList(0,Math.min(10,messages.size()));
    }
}
