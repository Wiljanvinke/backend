package com.doorloop.zwolle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ober {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String naam;
    private int tafel;

    public Ober(){
        setNaam("John Doe");
        setTafel(1);
    }

    public Ober(String naam, int tafel){
        setNaam(naam);
        setTafel(tafel);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getTafel() {
        return tafel;
    }

    public void setTafel(int tafel) {
        this.tafel = tafel;
    }
}
