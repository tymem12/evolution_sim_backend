package com.example.demo;

import java.util.HashMap;

import com.example.demo.genome.nodes.Node;

public class Settings {
    private final int NUMBER_OF_GENES; 
    private final int WIDTH;
    private final int HIGHT;
    private final int NUMBER_OF_INDIVIDUALS;
    private final int NUMBER_OF_POSSIBLE_ACTION_NODES;  //how many types od action nodes are 
    private final int NUMBER_OF_POSSIBLE_SENSOR_NODES;  //how many types od action nodes are
    private final int NUMBER_OF_POSSIBLE_NEURON_NODES;  //how many types od action nodes are
    private final int NUMBER_OF_POSSIBLE_TRAIT_NODES;   //TraitNode explanation
    private final HashMap<Node, Integer> ACTION_NODES_IDS;
    private final HashMap<Node, Integer> SENSOR_NODES_IDS;
    private final HashMap<Node, Integer> TRAITS_NODES_IDS;
    public HashMap<Node, Integer> getACTION_NODES_IDS() {
        return ACTION_NODES_IDS;
    }

    public HashMap<Node, Integer> getSENSOR_NODES_IDS() {
        return SENSOR_NODES_IDS;
    }

    public HashMap<Node, Integer> getTRAITS_NODES_IDS() {
        return TRAITS_NODES_IDS;
    }

    private final int EXISTANCE_PERIOD;
    


    
    public int getEXISTANCE_PERIOD() {
        return EXISTANCE_PERIOD;
    }

    public Settings(int number_of_genes, int hight, int number_OF_INDIVIDUALS, int width, int[] action_NODES_IDS, int number_OF_POSSIBLE_ACTION_NODES, int number_OF_POSSIBLE_NEURON_NODES, int number_OF_POSSIBLE_SENSOR_NODES, int number_OF_POSSIBLE_TRAIT_NODES, int[] sensor_NODES_IDS, int[] traits_NODES_IDS, int existance_PERIOD, HashMap<Node, Integer> action_NODES_IDS2, HashMap<Node, Integer> sensor_NODES_IDS2, HashMap<Node, Integer> traits_NODES_IDS2){
        this.NUMBER_OF_GENES = number_of_genes;
        this.WIDTH = width;
        this.HIGHT = hight;
        this.NUMBER_OF_INDIVIDUALS = number_OF_INDIVIDUALS;
        this.NUMBER_OF_POSSIBLE_ACTION_NODES = number_OF_POSSIBLE_ACTION_NODES;
        this.NUMBER_OF_POSSIBLE_SENSOR_NODES = number_OF_POSSIBLE_SENSOR_NODES;
        this.NUMBER_OF_POSSIBLE_NEURON_NODES = number_OF_POSSIBLE_NEURON_NODES;
        this.NUMBER_OF_POSSIBLE_TRAIT_NODES = number_OF_POSSIBLE_TRAIT_NODES;
        this.ACTION_NODES_IDS = action_NODES_IDS2;
        this.SENSOR_NODES_IDS = sensor_NODES_IDS2;
        this.TRAITS_NODES_IDS = traits_NODES_IDS2;
        
        this.EXISTANCE_PERIOD = existance_PERIOD;


    }
    
    public int getNUMBER_OF_GENES() {
        return NUMBER_OF_GENES;
    }
    public int getWIDTH() {
        return WIDTH;
    }

    public int getHIGHT() {
        return HIGHT;
    }

    public int getNUMBER_OF_INDIVIDUALS() {
        return NUMBER_OF_INDIVIDUALS;
    }

    public int getNUMBER_OF_POSSIBLE_ACTION_NODES() {
        return NUMBER_OF_POSSIBLE_ACTION_NODES;
    }

    public int getNUMBER_OF_POSSIBLE_SENSOR_NODES() {
        return NUMBER_OF_POSSIBLE_SENSOR_NODES;
    }

    public int getNUMBER_OF_POSSIBLE_NEURON_NODES() {
        return NUMBER_OF_POSSIBLE_NEURON_NODES;
    }

    public int getNUMBER_OF_POSSIBLE_TRAIT_NODES() {
        return NUMBER_OF_POSSIBLE_TRAIT_NODES;
    }

 

}