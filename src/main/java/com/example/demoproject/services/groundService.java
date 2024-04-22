package com.example.demoproject.services;

import com.example.demoproject.Entity.Ground;
import com.example.demoproject.pojo.GroundPojo;

import java.util.List;

public interface groundService {
    void saveData(GroundPojo groundpojo);
    List<Ground> getAll();
}
