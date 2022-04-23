package com.letscode.clientmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class ClientMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientMicroServiceApplication.class, args);
    }

}
