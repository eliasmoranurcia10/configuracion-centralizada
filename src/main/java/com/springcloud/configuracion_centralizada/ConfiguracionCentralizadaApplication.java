package com.springcloud.configuracion_centralizada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfiguracionCentralizadaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfiguracionCentralizadaApplication.class, args);
	}
}
