package com.mengzhou.controllers;

import com.mengzhou.User;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class MessageController {

    private final KafkaTemplate<String, User> kafkaTemplate;

    public MessageController(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestBody User user) {
        kafkaTemplate.send("demo-topic", user);
        return ResponseEntity.ok("Sent user: " + user.getName() + ", age: " + user.getAge());
    }
}