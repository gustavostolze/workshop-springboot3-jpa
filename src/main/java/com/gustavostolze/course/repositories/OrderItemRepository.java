package com.gustavostolze.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavostolze.course.entities.OrderItem;
import com.gustavostolze.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
