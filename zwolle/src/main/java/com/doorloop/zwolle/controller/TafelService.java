package com.doorloop.zwolle.controller;

import com.doorloop.zwolle.model.Tafel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TafelService {

    @Autowired
    private TafelRepository tafelRepository;

    public Iterable<Tafel> alleTafels(){
        tafelRepository.save(new Tafel());
        return tafelRepository.findAll();
    }
}
