package com.example.formstackkafka.controller;

import com.example.formstackkafka.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/formstack/api/v1")
public class FormStackWebhookController {

    @Autowired
    KafkaService kafkaService;

    @PostMapping("/webhook")
    public void submitWebHookResponse(@RequestBody String message){

        kafkaService.sendMessage(message);

        System.out.println(message);

    }
}
