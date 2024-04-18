package com.projeto.torneio.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;

    public String planetName;

    public String location;

    public String ruler;

    public String topScorer;


    //


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getRuler() {
        return ruler;
    }

    public void setRuler(String ruler) {
        this.ruler = ruler;
    }

    public String getTopScorer() {
        return topScorer;
    }

    public void setTopScorer(String topScorer) {
        this.topScorer = topScorer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
