package com.example.simplicore;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String name;
    private String mobileNo;
    private String email;


    public Student(String name,String mobileNo,String email) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.email = email;
    }

}
