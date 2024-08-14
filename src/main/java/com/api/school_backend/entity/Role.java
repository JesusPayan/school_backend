package com.api.school_backend.entity;

import jakarta.persistence.*;

import lombok.Data;

import java.util.List;

@Entity
@Table(name="role")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name =  "role_id")
    private Long roleId;
    @Column(name =  "role_descripcion")
    private String roleName;
    @OneToMany(mappedBy = "userID",cascade = CascadeType.ALL)
    private List<User> userList;

}
