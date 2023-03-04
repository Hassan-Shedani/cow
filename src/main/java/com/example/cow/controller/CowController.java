package com.example.cow.controller;

import com.example.cow.entity.Cow;
import com.example.cow.repository.CowRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CowController {
    private CowRepository cowRepository;

    public CowController(CowRepository cowRepository){
        this.cowRepository = cowRepository;
    }
    @PostMapping("/save")
    public Cow saveCOw(@RequestBody Cow cow) {
        return cowRepository.save(cow);

    }


}
