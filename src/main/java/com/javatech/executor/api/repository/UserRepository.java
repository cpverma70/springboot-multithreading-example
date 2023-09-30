package com.javatech.executor.api.repository;

import com.javatech.executor.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {



}
