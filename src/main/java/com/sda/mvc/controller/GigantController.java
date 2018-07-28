package com.sda.mvc.controller;

import com.sda.mvc.model.Fatigue;
import com.sda.mvc.model.GigantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.model.Nourishment;
import com.sda.mvc.view.GigantView;

import java.util.List;

public class GigantController {

    private GigantView gigantView;
    private List<GigantModel> gigantModelList;

    public GigantController(GigantView gigantView, List<GigantModel> gigantModelList) {
        this.gigantView = gigantView;
        this.gigantModelList = gigantModelList;
    }

    public Health getHealth(int index) { return gigantModelList.get(index).getHealth(); }

    public void setHealth(int index, Health health) {gigantModelList.get(index).setHealth(health); }

    public Fatigue getFatigue(int index) { return gigantModelList.get(index).getFatigue(); }

    public void setFatigue(int index, Fatigue fatigue) { gigantModelList.get(index).setFatigue(fatigue); }

    public Nourishment getNourishment(int index) { return gigantModelList.get(index).getNourishment(); }

    public void setNourishment(int index, Nourishment nourishment) { gigantModelList.get(index).setNourishment(nourishment); }




    public void updateView(int index){
        gigantView.displayGigant(gigantModelList.get(index));
    }
}
