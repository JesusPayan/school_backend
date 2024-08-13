package com.api.school_backend.controller;

import com.api.school_backend.entity.Role;
import com.api.school_backend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200")
public class RoleController {
    @Autowired
    RoleService roleService;
    @GetMapping("/roles")
    public List<Role> showRoles(){
        System.out.println("entro -> controller");
        System.out.println(roleService.findUserRoles());
      return  roleService.findUserRoles();
    }
}
