package com.example.demo.simulation;

import com.example.demo.Settings;

public class Enviroment {

    private Area[] area;
    private int life_time;

    public Enviroment(Settings settings){
        life_time = settings.getEXISTANCE_PERIOD();
    }


}
