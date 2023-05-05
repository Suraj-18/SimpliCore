//package com.example.simplicore;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class StudentService {
//
//    private final StudentRepo studentRepo;
//
//    public void addStudents(StudentBean studentBean) {
//       Student student = Student.builder()
//               .name(studentBean.getName())
//               .email(studentBean.getEmail())
//               .mobileNo(studentBean.getMobileNo())
//               .build();
//       studentRepo.save(student);
//    }
//
//    public List<Student> getStudents() {
//        return studentRepo.findAll();
//    }
//}
