package com.csuf.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final String TOPIC_NAME="Spring-Boot-Topic";
    @KafkaListener(topics = TOPIC_NAME, groupId = "kafkaGroup")
    public void kafkaListener(String message){
        System.out.println("Message from kafka Consumer : "+ message);
    }
}
