package com.anandhu.Springboot_Kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducers {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducers.class);
	
	private KafkaTemplate<String, String> kafkaTemplate;

	public KafkaProducers(KafkaTemplate<String, String> kafkaTemplate) {
		
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sentMessage(String message)
	{
		LOGGER.info(String.format("Message sent %s", message));
		kafkaTemplate.send("JavaGuides", message);
	}
	

}
