package dev.muldev.ms.cartelera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CarteleraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarteleraApplication.class, args);
	}

}
