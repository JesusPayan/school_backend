package com.api.school_backend.repository;

import com.api.school_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface UserRepository extends JpaRepository<User,Long> {
    public List<User> findByActive();
}
