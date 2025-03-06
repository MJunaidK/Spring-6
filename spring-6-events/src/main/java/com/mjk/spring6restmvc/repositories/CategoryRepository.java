package com.mjk.spring6restmvc.repositories;

import com.mjk.spring6restmvc.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface CategoryRepository extends JpaRepository<Category, UUID> {
}
