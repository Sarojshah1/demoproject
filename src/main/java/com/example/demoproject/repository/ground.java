package com.example.demoproject.repository;

import com.example.demoproject.Entity.Ground;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ground extends JpaRepository<Ground, Long> {
    
}
