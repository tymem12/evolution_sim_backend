package com.example.demo.genome;

import java.io.Serializable;

import com.example.demo.genome.nodes.Node;
import com.example.demo.utils.MathLib;

public class Gene implements Serializable{
    
    private String byte_representation;
    private int number_of_be;
    private int number_type_of_input_node;
    private int number_type_of_output_node;
    private Node input_node;
    private Node output_node;
    private double weight;

    //constructor for first initialization
    public Gene(){
        this.byte_representation = MathLib.generateRandomBits(32);
        //03.02- tutaj skończone
    }



    public String getByte_representation() {
        return byte_representation;
    }
    public void setByte_representation(String byte_representation) {
        this.byte_representation = byte_representation;
    }
    public int getNumber_of_be() {
        return number_of_be;
    }
    public void setNumber_of_be(int number_of_be) {
        this.number_of_be = number_of_be;
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
    
}
