package com.example.Lab92.services;

import com.example.Lab92.model.Message;

import java.util.List;

public interface MessageService {

    List<Message> getLastMessages() throws MessageException;

    void saveMessage(Message message) throws MessageException;

}
