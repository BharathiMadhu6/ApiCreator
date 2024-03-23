package com.BharathiMadhu.ApiCreator.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(
                "Riddhi",
                6,
                "RiddhisMom@gmail.com",
                LocalDate.of(2023, Month.MARCH,2),
                1
        ));

        return studentList;
    }
}
