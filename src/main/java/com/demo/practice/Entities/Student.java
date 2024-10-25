package com.demo.practice.Entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*@Lob
    @Column(name = "profile_image")
    private String profileImg;
    private String name;
    private String batch;
    private int roll;
    @Column(name = "reg_number")
    private int regNumber;
    private String dept;
    private String shift;
    @Column(name = "blood_group")
    private String bloodGroup;
    private String gender;
    private String contact;*/
    private String name;
    private String email;
    private int age;
}
