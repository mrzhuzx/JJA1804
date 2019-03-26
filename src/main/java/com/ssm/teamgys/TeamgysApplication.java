package com.ssm.teamgys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TeamgysApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamgysApplication.class, args);
    }

}
