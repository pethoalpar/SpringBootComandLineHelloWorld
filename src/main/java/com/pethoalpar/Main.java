package com.pethoalpar;

import com.pethoalpar.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootApplication
public class Main implements CommandLineRunner{

    @Autowired
    private HelloService helloService;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Main.class);
        app.run(args);
    }

    public void run(String... strings) throws Exception {
        System.out.println(helloService.getMessage());
    }
}
