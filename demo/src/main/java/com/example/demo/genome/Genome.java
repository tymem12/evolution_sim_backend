package com.example.demo.genome;

import java.util.ArrayList;
import java.util.List;

public class Genome {

    private List<Gene> list_of_genes;
    private int number_of_genes;
    
    public Genome(int number_of_genes){
        list_of_genes = new ArrayList<>();
        this.number_of_genes = number_of_genes;
        for(int i = 0;i< number_of_genes; i++){
            list_of_genes.add(new Gene());
        }

    }
    
}
