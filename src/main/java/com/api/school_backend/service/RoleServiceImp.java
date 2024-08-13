package com.api.school_backend.service;

import com.api.school_backend.entity.Role;
import com.api.school_backend.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class RoleServiceImp implements RoleService{
    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<Role> findUserRoles(){
             return roleRepository.findAll();
    }
    @Override
    public Role createNewRole(Role newRole){
        return new Role();
    }
    @Override
    public Role updateRole(Long id, Role updateRole){
        return new Role();
    }
    public Boolean deleteRole(Long id){
        return true;
    }



}
