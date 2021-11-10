package com.example.kafkaconsumer;

import jparepo.jparepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@SpringBootApplication
public class KafkaconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaconsumerApplication.class, args);


	}


	@KafkaListener(topics = "kafka_example" , groupId = "groupid")
	public void consume(String message)
	{
		System.out.println(message);



	}


}
