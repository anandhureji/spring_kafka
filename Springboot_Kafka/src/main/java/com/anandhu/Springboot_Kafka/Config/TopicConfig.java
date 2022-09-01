package com.anandhu.Springboot_Kafka.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {
	
	@Bean
	public NewTopic javaguidesTopic() {
		return TopicBuilder.name("JavaGuides").partitions(10).replicas(1).build();
//		return TopicBuilder.name("JavaGuides").build();
		
	}
	
	@Bean
	public NewTopic javajsonguidesTopic() {
		return TopicBuilder.name("JavaGuides_Json").partitions(10).replicas(1).build();
//		return TopicBuilder.name("JavaGuides").build();
		
	}

}
