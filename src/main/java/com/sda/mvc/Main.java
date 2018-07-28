package com.sda.mvc;

import com.sda.mvc.controller.GigantController;
import com.sda.mvc.model.Fatigue;
import com.sda.mvc.model.GigantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.model.Nourishment;
import com.sda.mvc.view.GigantView;

public class Main {
    public static void main(String[] args) {
        GigantModel gigantModel = new GigantModel(Health.WOUNDED, Fatigue.TRIED, Nourishment.SATURATED);
        GigantView gigantView = new GigantView();

        GigantController gigantController = new GigantController(gigantView, gigantModel );

        gigantController.updateView();
        gigantController.setHealth(Health.DEAD);
        gigantController.updateView();

    }
}
