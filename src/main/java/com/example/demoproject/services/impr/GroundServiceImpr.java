package com.example.demoproject.services.impr;

import com.example.demoproject.Entity.Ground;
import com.example.demoproject.pojo.GroundPojo;
import com.example.demoproject.repository.GroundRepository;
import com.example.demoproject.services.groundService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

@RequiredArgsConstructor
public class GroundServiceImpr implements groundService {

    private final GroundRepository groundRepository;

    @Override
    public void deleteById(Integer id) {
        groundRepository.deleteById(id);
    }

    @Override
    public List<Ground> getAll() {
        return groundRepository.findAll();
    }

    public void saveData(@RequestBody GroundPojo groundpojo) {
        Ground ground = new Ground();
        ground.setId(groundpojo.getId());
        ground.setGround_name(groundpojo.getName());
        groundRepository.save(ground);
    }

}
