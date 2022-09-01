package com.anandhu.Springboot_Kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.anandhu.Springboot_Kafka.model.User;

@Service
public class JsonKafkaConsumer {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	@KafkaListener(topics="JavaGuides_Json",groupId = "myGroup")
	public void consume(User user)
	{
		LOGGER.info(String.format("Json message recieved-> %s", user.toString()));
		
	}

}
