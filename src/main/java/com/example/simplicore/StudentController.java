package com.example.simplicore;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping(value = "/student")
    public String saveStudent(@RequestBody StudentBean studentBean) {
        studentService.addStudents(studentBean);
        return "Successfully added";
    }

    @GetMapping(value = "/student")
    public ResponseEntity<List<StudentBean>> getStudent() {
       List<Student> studentList =  studentService.getStudents();
       List<StudentBean> studentBeans = studentList.stream().map(StudentBean ::new).toList();
       return ResponseEntity.ok(studentBeans);
    }
}
