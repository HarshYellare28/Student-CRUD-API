package com.springPrj.studentApp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student harsh = new Student(
                    1L,
                    "Harsh",
                    "yellareharsh@gmail.com",
                    LocalDate.of(2001, JANUARY, 28)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, JANUARY, 28)
            );

            repository.saveAll(
                    List.of(harsh,alex)
            );
        };
    }
}