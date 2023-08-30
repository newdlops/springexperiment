package com.example.springexperiment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.MySQLContainer;
// import org.testcontainers.containers.RabbitMQContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringexperimentApplication {

    // @Bean
    // @ServiceConnection
    // MySQLContainer<?> mysqlContainer() {
    //     return new MySQLContainer<>(DockerImageName.parse("mysql:latest"));
    // }

    // @Bean
    // @ServiceConnection
    // RabbitMQContainer rabbitContainer() {
    //     return new RabbitMQContainer(DockerImageName.parse("rabbitmq:latest"));
    // }

    public static void main(String[] args) {
        SpringApplication.from(SpringexperimentApplication::main).with(TestSpringexperimentApplication.class).run(args);
    }

}
