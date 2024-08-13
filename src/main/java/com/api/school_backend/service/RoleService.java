package com.api.school_backend.service;

import com.api.school_backend.entity.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {

    public List<Role> findUserRoles();
    public Role createNewRole(Role newRole);
    public Role updateRole(Long id, Role updateRole);
    public Boolean deleteRole(Long id);

}
