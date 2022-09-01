package com.anandhu.Springboot_Kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anandhu.Springboot_Kafka.kafka.JsonKafkaProducer;
import com.anandhu.Springboot_Kafka.model.User;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {
	
	
	private JsonKafkaProducer jsonKafkaProducer;

	public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
		this.jsonKafkaProducer = jsonKafkaProducer;
	}
	
	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody User user)
	{
		jsonKafkaProducer.sendMessage(user);
		return ResponseEntity.ok("Json Message sent to kafka topic");
		
		
	}
	
	
	
	

	
}
