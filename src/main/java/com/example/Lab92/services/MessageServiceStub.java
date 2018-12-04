package com.example.Lab92.services;

import com.example.Lab92.model.Message;
import com.example.Lab92.persitence.MessagePersistece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceStub implements MessageService {

    @Autowired
    MessagePersistece persistece;

    @Override
    public List<Message> getLastMessages() throws MessageException {
        return persistece.getLastMessages();
    }

    @Override
    public void saveMessage(Message message) throws MessageException {
        persistece.saveMessage(message);
    }
}
