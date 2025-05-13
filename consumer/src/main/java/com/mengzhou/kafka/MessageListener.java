package com.mengzhou.kafka;

import com.mengzhou.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @KafkaListener(topics = "demo-topic", groupId = "group-1")
    public void listen(User user) {
        System.out.println("Received user: " + user.getName() + ", age: " + user.getAge());
    }
}


