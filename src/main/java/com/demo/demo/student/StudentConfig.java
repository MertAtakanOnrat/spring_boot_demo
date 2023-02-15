package com.demo.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.SEPTEMBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student mert = new Student(
                    "Mert Onrat",
                    "mertoatakan@gmail.com",
                    LocalDate.of(1999, SEPTEMBER ,11),
                    24
            );

            Student atakan = new Student(
                    "Atakan Onrat",
                    "matakanonrat@gmail.com",
                    LocalDate.of(1999, SEPTEMBER ,11),
                    24
            );

            repository.saveAll(
                    List.of(mert, atakan)
            );
        };
    }
}
