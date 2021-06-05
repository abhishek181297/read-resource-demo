package com.abhishek.readresourcedemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ReadResourceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReadResourceDemoApplication.class, args);

		try {
			User user = JsonMapper.convertJsonToPojo("data/user.json", User.class);
			log.info("User Data retrieved {}", user);
		} catch (ClassNotFoundException | JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
