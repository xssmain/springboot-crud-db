package com.springbootnelio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootnelio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
