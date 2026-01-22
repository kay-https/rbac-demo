package com.kayllanne.rbacdemo.repository;

import com.kayllanne.rbacdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
