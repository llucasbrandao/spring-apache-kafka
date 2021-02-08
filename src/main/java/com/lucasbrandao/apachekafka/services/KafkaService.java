package com.lucasbrandao.apachekafka.services;

public interface KafkaService {
	
	void sendMessage(String message);
	
	void listen(String message);
}
