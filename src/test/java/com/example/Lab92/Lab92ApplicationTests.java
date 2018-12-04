package com.example.Lab92;

import com.example.Lab92.model.Message;
import com.example.Lab92.persitence.MessagePersistece;
import com.example.Lab92.services.MessageException;
import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Lab92ApplicationTests {

    @Autowired
    MessagePersistece persistece;

    @Test
    public void contextLoads() {
    }

    @Test
    public void sendRegisters() throws MessageException, IOException {
        String postUrl = "https://lab9arsw.herokuapp.com/messages";
        Gson gson = new Gson();
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(postUrl);
        Message message = new Message();
        message.setMessage("Hola");
        StringEntity postingString = new StringEntity(gson.toJson(message));
        post.setEntity(postingString);
        post.setHeader("Content-type", "application/json");
        HttpResponse response = httpClient.execute(post);
        System.out.println(response);
//        Assert.assertArrayEquals();

    }

}
