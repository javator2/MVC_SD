package com.sda.mvc.model;

public class GigantModel {

    Health health;
    Fatigue fatigue;
    Nourishment nourishment;

    public GigantModel(Health health, Fatigue fatigue, Nourishment nourishment) {
        this.health = health;
        this.fatigue = fatigue;
        this.nourishment = nourishment;
    }

    public Health getHealth() { return health; }

    public void setHealth(Health health) { this.health = health; }

    public Fatigue getFatigue() { return fatigue; }

    public void setFatigue(Fatigue fatigue) { this.fatigue = fatigue; }

    public Nourishment getNourishment() { return nourishment; }

    public void setNourishment(Nourishment nourishment) { this.nourishment = nourishment; }

    @Override
    public String toString() {
        return "GigantModel{" +
                "health=" + health +
                ", fatigue=" + fatigue +
                ", nourishment=" + nourishment +
                '}';
    }
}
