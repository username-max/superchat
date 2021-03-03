package ru.username.superchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SuperchatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperchatApplication.class, args);
	}

}
