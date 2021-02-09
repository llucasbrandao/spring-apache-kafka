package com.lucasbrandao.apachekafka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasbrandao.apachekafka.services.impl.KafkaServiceImpl;

@RestController
@RequestMapping(path = "/kafka", produces = MediaType.APPLICATION_JSON_VALUE)
public class KafkaController {
	
	@Autowired
	private KafkaServiceImpl kafkaService;
	
	@GetMapping(path = "{message}")
	public ResponseEntity<HttpStatus> sendMessage(@PathVariable String message) {
		kafkaService.sendMessage(message);
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
