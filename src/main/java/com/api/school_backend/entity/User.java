package com.api.school_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table(name = "user")
@Entity
@Inheritance(strategy = InheritanceType.JOINED) // Join table inheritance
@DiscriminatorColumn(name = "role") // Column to store the type of user (student, teacher, etc.)
@DiscriminatorValue("2") // Value that will be stored in the "user_type" column for this class (Student, Teacher, etc.)

@Data
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userID;
    @Column(name = "user_name",nullable = false,length = 40)
    private String userName;
    @Column(name = "user_lastname",nullable = false,length = 40)
    private String userLastName;
    @Column(name = "uuid",nullable = false,length = 15,unique = true)
    private String  uu_id;
    @Column(name = "user_password",nullable = false,length = 8)
    private String userPassword;
    @Column(name = "active",nullable = false)
    private Boolean active;
    @Column(name = "email",nullable = false,length = 40,unique = true)
    private String email;
    @OneToOne
    @JoinColumn(name = "student_id", referencedColumnName = "user_id", unique = true)
    private Student student;
    @OneToOne
    @JoinColumn(name = "teacher_id", referencedColumnName = "user_id", unique = true)
    private Teacher teacher;
    @ManyToOne
    @JoinColumn(name = "role", referencedColumnName = "role_id")
    private Role role;

}
