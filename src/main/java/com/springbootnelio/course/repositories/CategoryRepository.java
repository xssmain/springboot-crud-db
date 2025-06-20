package com.springbootnelio.course.repositories;

import com.springbootnelio.course.entities.Category;
import com.springbootnelio.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
