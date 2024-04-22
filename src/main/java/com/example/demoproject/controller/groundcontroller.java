package com.example.demoproject.controller;

import com.example.demoproject.Entity.Ground;
import com.example.demoproject.pojo.GroundPojo;
import com.example.demoproject.services.groundService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ground")

@RequiredArgsConstructor
public class groundcontroller {
    private groundService groundservice;

    @GetMapping("/get")
        public List<Ground> getData(){
           return this.groundservice.getAll();
        }
    @PostMapping("/save")
    public void save(@RequestBody GroundPojo groundpojo){
        this.groundservice.saveData(groundpojo);
    }
}
