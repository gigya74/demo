package com.example.demo.repository;

import com.example.demo.entity.MenuEntity;
import com.example.demo.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  MenuRepository extends JpaRepository<MenuEntity, Long> {
   // List<MenuEntity> findByName(String name);
}
