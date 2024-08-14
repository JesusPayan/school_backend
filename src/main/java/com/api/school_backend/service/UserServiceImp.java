package com.api.school_backend.service;

import com.api.school_backend.entity.User;
import com.api.school_backend.repository.UserRepository;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getUsers() {
        return userRepository.findByActive();
    }

    @Override
    public List<User> getUsers(Long roleId) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User updateUser(Long id, User updatedUser) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
