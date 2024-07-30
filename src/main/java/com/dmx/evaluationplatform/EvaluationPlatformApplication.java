package com.dmx.evaluationplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dmx.evaluationplatform.model.dao")
public class EvaluationPlatformApplication {
    public static void main(String[] args) {
        SpringApplication.run(EvaluationPlatformApplication.class, args);
    }
}