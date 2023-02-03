package com.certus.ejemploconsumidor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootTest
class EjemploConsumidorApplicationTests {

	@Test
	void contextLoads() {
	}

	public static class Config {
	}
}
