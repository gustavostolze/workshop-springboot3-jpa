package com.gustavostolze.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavostolze.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
