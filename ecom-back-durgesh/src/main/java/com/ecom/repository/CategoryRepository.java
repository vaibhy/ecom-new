package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
