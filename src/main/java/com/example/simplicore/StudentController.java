package com.example.simplicore;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class StudentController {


//    @PostMapping(value = "/student")
//    public String saveStudent(@RequestBody StudentBean studentBean) {
//        studentService.addStudents(studentBean);
//        return "Successfully added";
//    }

    @GetMapping(value = "/student")
    public ResponseEntity<StudentBean> getStudent() {
        StudentBean studentBean = new StudentBean(1,"suraj","lohana.suraj66@gmail.com","03322824954");
//       List<Student> studentList =  studentService.getStudents();
//       List<StudentBean> studentBeans = studentList.stream().map(StudentBean ::new).toList();
       return ResponseEntity.ok(studentBean);
    }
}
