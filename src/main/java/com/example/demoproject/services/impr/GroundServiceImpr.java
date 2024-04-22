package com.example.demoproject.services.impr;

import com.example.demoproject.Entity.Ground;
import com.example.demoproject.pojo.GroundPojo;
import com.example.demoproject.repository.ground;
import com.example.demoproject.services.groundService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

@RequiredArgsConstructor
public class GroundServiceImpr implements groundService {
    private final ground groundRepository;
    @Override
    public List<Ground> getAll(){
        return groundRepository.findAll();

    }
    public void saveData(@RequestBody GroundPojo groundPojo) {

        Ground ground = new Ground();

        ground.setId(groundPojo.getId());

        ground.setGround_name(groundPojo.getName());

        groundRepository.save(ground);




    }

}
