package com.example.Lab92.persitence;

import com.example.Lab92.model.Message;
import com.example.Lab92.services.MessageException;

import java.util.List;

public interface MessagePersistece {

    void saveMessage(Message message) throws MessageException;

    List<Message> getLastMessages() throws MessageException;
}
