package com.example.POCTaxNotification.kafkaProducer;

import com.example.POCTaxNotification.pojo.NotificationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Configuration
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, NotificationData> kafkaTemplate;

    public void sendMessage(NotificationData obj) {
        kafkaTemplate.send("demo-topic", obj);
    }
}