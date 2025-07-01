package com.springbootnelio.course.repositories;

import com.springbootnelio.course.entities.OrderItem;
import com.springbootnelio.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
