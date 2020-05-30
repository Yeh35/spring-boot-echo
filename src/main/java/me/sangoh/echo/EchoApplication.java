package me.sangoh.echo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EchoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EchoApplication.class);
        app.run(args);
    }

}
