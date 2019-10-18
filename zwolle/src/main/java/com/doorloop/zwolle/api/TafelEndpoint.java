package com.doorloop.zwolle.api;

import com.doorloop.zwolle.controller.TafelService;
import com.doorloop.zwolle.model.Tafel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TafelEndpoint {
    @Autowired
    TafelService tafelService;

    @GetMapping("/tafel")
    public Tafel proberen(){
        System.out.println("Gelukt");
        return new Tafel(false, "1");
    }
    @GetMapping("/alletafels")
    public Iterable<Tafel> geefTafels(){
        return tafelService.alleTafels();
    }
}
