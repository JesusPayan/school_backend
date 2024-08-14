package com.api.school_backend.service;


import com.api.school_backend.entity.Student;
import com.api.school_backend.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getUsers();
    public List<User> getUsers(Long roleId);

    public User getUserById(Long id);
    public User saveUser(User user);
    public User updateUser(Long id, User updatedUser);

    public void deleteUser(Long id);

}
