package com.gustavostolze.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavostolze.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
