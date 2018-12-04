package com.example.Lab92.controller;

import com.example.Lab92.model.Message;
import com.example.Lab92.services.MessageException;
import com.example.Lab92.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/message")
public class APIContoller {

    @Autowired
    MessageService service;

    @GetMapping
    public ResponseEntity<?> getEventsHandler() {
        try {
            return new ResponseEntity<>(service.getLastMessages(), HttpStatus.ACCEPTED);
        } catch (MessageException ex) {
            Logger.getLogger(MessageException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<?> postSaveMessageHandler(@RequestBody Message message) {
        try {
            message.setTime(new Timestamp(System.currentTimeMillis()));
            service.saveMessage(message);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (MessageException ex) {
            Logger.getLogger(MessageException.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.FORBIDDEN);
        }
    }
    
}
