package com.demo.demo;

import com.demo.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	/*@GetMapping
	public String hello(){
		return "Hello World!";
	}*/
	@GetMapping
	public List<Student> hello(){
		return List.of(
				new Student(
						1L,
						"Mert Atakan Onrat",
						"mertoatakan@gmail.com",
						LocalDate.of(1999, Month.SEPTEMBER ,11),
						24
				)
		);
	}


}
