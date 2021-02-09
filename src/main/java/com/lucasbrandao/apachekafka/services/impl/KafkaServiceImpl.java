package com.lucasbrandao.apachekafka.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.lucasbrandao.apachekafka.services.KafkaService;
import com.lucasbrandao.apachekafka.utils.LoggerUtil;

@Service
public class KafkaServiceImpl implements KafkaService {
	
	private static final String TOPIC = "test";
	private static final String GROUP_ID = "group-id";
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Override
	public void sendMessage(String message) {
		kafkaTemplate.send(TOPIC, message);
		
	}
	
	@Override
	@KafkaListener(topics = TOPIC, groupId = GROUP_ID)
	public void listen(String message) {
		LoggerUtil.log("Mensagem Kafka: " + message, "info", this.getClass());
	}
}
