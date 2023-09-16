package dev.marksduarte.matriculaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MatriculaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MatriculaServiceApplication.class, args);
    }

}
