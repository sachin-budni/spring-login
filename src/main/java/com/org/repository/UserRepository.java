package com.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
