package com.csuf.controller;

import com.csuf.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/kafka")
    public String sendMessage(@RequestParam String message){
        kafkaProducer.sendMessage(message);
        return "Message sent";
    }

}
