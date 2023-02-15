package com.demo.demo.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
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
