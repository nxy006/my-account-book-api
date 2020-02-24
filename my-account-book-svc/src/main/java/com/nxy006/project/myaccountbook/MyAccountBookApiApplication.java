package com.nxy006.project.myaccountbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MyAccountBookApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyAccountBookApiApplication.class, args);
    }
}
