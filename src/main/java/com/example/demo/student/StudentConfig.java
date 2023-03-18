package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student jao = new Student(
                    "Jão",
                    "jao@gmail.com",
                    LocalDate.of(2002, Month.JANUARY, 5)
            );

            Student zeDeVotuporanga = new Student(
                    "Zé de Votuporanga",
                    "votuporanguinho@gmail.com",
                    LocalDate.of(1966, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(mariam, jao, zeDeVotuporanga)
            );
        };
    }
}