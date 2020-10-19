/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geneticalgorithm;

import java.util.Random;

/**
 *
 * @author Adrian
 */
public class Individual {
    
    public Integer[] genes = new Integer[GA.chromosomeLength];
    public Double fitness;
    public Double probability;
    
    public void generateIndividual(){
        
        Random random = new Random();
        for(int i = 0; i < GA.chromosomeLength; i++){
            Integer gene;
            do {
                gene = random.nextInt(GA.delay) + 1;
            } while(((i+2) - gene) < 0);
            genes[i] = gene ;
        }
    } 
}
