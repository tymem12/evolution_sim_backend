package com.example.demo.simulation;

import java.util.ArrayList;

import com.example.demo.Settings;
import com.example.demo.individual.Individual;

public class Simulation {
    int number_of_indivduals;
    int width;
    int hight;
    Area area;

    ArrayList<Individual> individual_list;

    public Simulation(Settings settings ){
        individual_list = new ArrayList<>();
        for(int i = 0; i < number_of_indivduals; i++){
            individual_list.add(new Individual(settings));
        }
        area = new Area();

        // coś observer lub MVC żeby wyśetlana macierz zobaczyła


    }
    
    public void preperaFirstGeneration(){

        
        
        
    }

}
