package br.com.fontoura.kafkaproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Value(value = "${kafka.topic.one}")
    private String topicOne;

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;


    public void producerMessage(String message) {
        kafkaTemplate.send(topicOne, message);
    }

}
