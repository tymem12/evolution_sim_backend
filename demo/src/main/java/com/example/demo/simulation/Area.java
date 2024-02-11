package com.example.demo.simulation;

import java.io.Serializable;

import com.example.demo.Settings;


public class Area implements Serializable{
    int width;
    int hight;
    Field[][] area_t;

    public Area(Settings settings){
        this.width = settings.getWIDTH();
        this.hight = settings.getHIGHT();
        this.area_t = new Field[this.hight][this.width];
        
    }



    
    

    
    
}
