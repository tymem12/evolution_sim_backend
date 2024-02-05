package com.example.demo.individual;

import com.example.demo.Settings;
import com.example.demo.genome.Genome;

public class Individual {
    Genome genome;
    
    public Individual(Settings settings){
        genome = new Genome(settings.getNUMBER_OF_GENES());

    }

}





