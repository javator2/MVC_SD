package com.sda.mvc;

import com.sda.mvc.controller.GigantController;
import com.sda.mvc.model.Fatigue;
import com.sda.mvc.model.GigantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.model.Nourishment;
import com.sda.mvc.view.GigantView;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GigantModel> gigantModel = new LinkedList<GigantModel>();
        GigantView gigantView = new GigantView();
        gigantModel.add(new GigantModel(Health.DEAD, Fatigue.TRIED, Nourishment.SATURATED ));

        GigantController gigantController = new GigantController(gigantView, gigantModel );

        gigantController.updateView(0);
        gigantController.setHealth(0, Health.WOUNDED);
        gigantController.updateView(0);

    }
}
