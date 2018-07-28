package com.sda.mvc.controller;

import com.sda.mvc.model.Fatigue;
import com.sda.mvc.model.GigantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.model.Nourishment;
import com.sda.mvc.view.GigantView;

public class GigantController {

    private GigantView gigantView;
    private GigantModel gigantModel;

    public GigantController(GigantView gigantView, GigantModel gigantModel) {
        this.gigantView = gigantView;
        this.gigantModel = gigantModel;
    }

    public Health getHealth() { return gigantModel.getHealth(); }

    public void setHealth(Health health) {gigantModel.setHealth(health); }

    public Fatigue getFatigue() { return gigantModel.getFatigue(); }

    public void setFatigue(Fatigue fatigue) { gigantModel.setFatigue(fatigue); }

    public Nourishment getNourishment() { return gigantModel.getNourishment(); }

    public void setNourishment(Nourishment nourishment) { gigantModel.setNourishment(nourishment); }




    public void updateView(){
        gigantView.displayGigant(gigantModel);
    }
}
