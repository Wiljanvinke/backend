package com.doorloop.zwolle.api;

import com.doorloop.zwolle.controller.OberService;
import com.doorloop.zwolle.model.Ober;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OberEndpoint {
    @Autowired
    OberService oberservice;

    @GetMapping("/ober")
    public Iterable<Ober> checkOber(){
        return oberservice.getOber();
    }

    @PostMapping("/ober")
    public Ober newOber(@RequestBody Ober ober) {
        System.out.println(ober.getNaam() + " " + ober.getTafel());
        return oberservice.save(ober);
    }
}
