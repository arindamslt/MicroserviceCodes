package com.arindam.service;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class KafkaConsumerService {
	/**
     * Listens for messages on the 'order-events' Kafka topic.
     * Logs the incoming message to the console.
     *
     * @param message the message received from Kafka
     */
    @KafkaListener(topics = "order-topic", groupId = "order-group")
    public void listen(String message) {
        System.out.println(" Received Order Event: " + message);
    }

}
