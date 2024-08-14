package com.api.school_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Base64;

@Entity
@Table(name = "Student")
@Data
public class Student extends User{
    @Column(name = "grade")
    private String grade;

    @ManyToOne
    @JoinColumn(name = "user_user_id")
    private User user;
    public Student() {
        Role role = new Role();
        role.setRoleId(2L);
        this.user.setRole(role);
        this.user.setUserPassword("Estudiante1");

    }
}
