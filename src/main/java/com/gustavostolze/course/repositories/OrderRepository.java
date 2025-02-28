package com.gustavostolze.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavostolze.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
