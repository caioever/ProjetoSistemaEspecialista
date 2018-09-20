package com.uva.ia.motordeinferencia;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.RepositoryDefinition;

@SpringBootApplication
public class MotorDeInferenciaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MotorDeInferenciaApplication.class, args);
    }
}
