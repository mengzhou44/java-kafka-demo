package com.mengzhou.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @KafkaListener(topics = "demo-topic", groupId = "group-1")
    public void listen(String message) {
        System.out.println("📥 Received in consumer-service: " + message);
    }
}