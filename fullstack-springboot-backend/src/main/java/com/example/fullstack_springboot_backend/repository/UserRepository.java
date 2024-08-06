package com.example.fullstack_springboot_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fullstack_springboot_backend.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
