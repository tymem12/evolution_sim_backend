package com.example.demo.genome;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Settings;
import com.example.demo.utils.MathLib;

public class Genome {

    private List<GeneType> list_of_genes;
    private int number_of_genes;
    
    public Genome(Settings settings){
        double SOME_VALUE = 1.0;

        list_of_genes = new ArrayList<>();
        this.number_of_genes = settings.getNUMBER_OF_GENES();
        for(int i = 0;i< number_of_genes; i++){
            if(SOME_VALUE > MathLib.getRandomDouble())
            list_of_genes.add(new Gene(settings));
            else list_of_genes.add(new TraitGene());
        }

    }
    
}
