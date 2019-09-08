package dev.muldev.ms.mstrailer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class MsTrailerApplication {
    

	public static void main(String[] args) {
		SpringApplication.run(MsTrailerApplication.class, args);
	}

}
