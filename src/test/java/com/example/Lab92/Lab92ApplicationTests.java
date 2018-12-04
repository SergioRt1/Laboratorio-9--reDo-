package com.example.Lab92;

import com.example.Lab92.persitence.MessagePersistece;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Lab92ApplicationTests {

    @Autowired
    MessagePersistece persistece;

    @Test
    public void contextLoads() {
    }

    @Test
    public void sendRegisters() {

    }

}
