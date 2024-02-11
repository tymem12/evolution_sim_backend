package com.example.demo.genome;

import java.io.Serializable;
import java.util.Objects;

import com.example.demo.Settings;
import com.example.demo.genome.nodes.Node;
import com.example.demo.utils.MathLib;

public class Gene extends GeneType implements Serializable{
    
    private int input_node_type;
    private int output_node_type;
    private int number_type_of_input_node;
    private int number_type_of_output_node;
    private Node input_node;
    private Node output_node;
    private double weight;
    private int id;


    //constructor for first initialization
    public Gene(Settings settings){
        
        this.byte_representation = "0" + MathLib.generateRandomBits(31);
        this.input_node_type = this.byte_representation.charAt(1);
        this.number_type_of_input_node = MathLib.binaryStringToInt(MathLib.getSubstring(this.byte_representation, 2,8))
         % ((this.input_node_type == 0) ? settings.getNUMBER_OF_POSSIBLE_SENSOR_NODES() : settings.getNUMBER_OF_POSSIBLE_NEURON_NODES());
        this.output_node_type = this.byte_representation.charAt(9);
        this.number_type_of_output_node = MathLib.binaryStringToInt(MathLib.getSubstring(this.byte_representation, 10,16))
        % ((this.output_node_type == 0) ? settings.getNUMBER_OF_POSSIBLE_ACTION_NODES() : settings.getNUMBER_OF_POSSIBLE_NEURON_NODES());
        
        this.weight = (double)MathLib.binaryStringToInt(MathLib.getSubstring(this.byte_representation, 17,31)) / 32768.0;
        String concatenatedAttributes = input_node_type +
                                       "-" + output_node_type +
                                       "-" + number_type_of_input_node +
                                       "-" + number_type_of_output_node;

        this.id = Objects.hash(concatenatedAttributes);
       
        //03.02- tutaj skończone
    }
  
  
    public int getNumber_type_of_input_node() {
        return number_type_of_input_node;
    }
    public void setNumber_type_of_input_node(int number_type_of_input_node) {
        this.number_type_of_input_node = number_type_of_input_node;
    }
    public int getNumber_type_of_output_node() {
        return number_type_of_output_node;
    }
    public void setNumber_type_of_output_node(int number_type_of_output_node) {
        this.number_type_of_output_node = number_type_of_output_node;
    }
    public Node getInput_node() {
        return input_node;
    }
    public void setInput_node(Node input_node) {
        this.input_node = input_node;
    }
    public Node getOutput_node() {
        return output_node;
    }
    public void setOutput_node(Node output_node) {
        this.output_node = output_node;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    // @Override
    // public boolean equals(Object obj){
    //     if(!(obj instanceof Gene)) return false;
    //     Gene gene2 = (Gene) obj;
    //     if(this.number_type_of_input_node)
        
    // }

    public boolean equalConnection(Gene gene2){
        if(this.number_type_of_input_node == gene2.getNumber_type_of_input_node() &&
         this.number_type_of_output_node == gene2.number_type_of_output_node) return true;
        return false;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
