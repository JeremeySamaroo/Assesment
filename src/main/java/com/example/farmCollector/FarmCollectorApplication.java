package com.example.farmCollector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class FarmCollectorApplication {

	public static void main(String[] args) {

		//swagger url: http://localhost:8080/swagger-ui/index.html
		SpringApplication.run(FarmCollectorApplication.class, args);

//		ConfigurableApplicationContext context = SpringApplication.run(FarmCollectorApplication.class, args);
//		Environment env = context.getEnvironment();
//		String scheme = env.getProperty("server.scheme");
//		String host = env.getProperty("server.host");
//		int port = 8080;
//		String swaggerUrl = scheme + "://" + host + ":" + port + "/swagger-ui/index.html";
//		System.out.println("Swagger UI available at: " + swaggerUrl);
//		try {
//			java.awt.Desktop.getDesktop().browse(java.net.URI.create(swaggerUrl));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}
}
