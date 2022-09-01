package com.anandhu.Springboot_Kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anandhu.Springboot_Kafka.kafka.KafkaProducers;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
	
	private KafkaProducers kafkaProducers;

	public MessageController(KafkaProducers kafkaProducers) {
		this.kafkaProducers = kafkaProducers;
	}
	
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("messagge") String message)
	{
		kafkaProducers.sentMessage(message);
		return ResponseEntity.ok("Message sent to the topic ");
		
	}
	
	
	

}
