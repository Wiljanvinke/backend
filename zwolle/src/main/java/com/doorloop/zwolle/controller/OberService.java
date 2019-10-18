package com.doorloop.zwolle.controller;

import com.doorloop.zwolle.model.Ober;
import com.doorloop.zwolle.model.Tafel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OberService {
    @Autowired
    private OberRepository oberRepository;

    public Iterable<Ober> getOber(){
        oberRepository.save(new Ober());
        return oberRepository.findAll();
    }

    public Ober save(Ober ober){
        return oberRepository.save(ober);
    }
}
