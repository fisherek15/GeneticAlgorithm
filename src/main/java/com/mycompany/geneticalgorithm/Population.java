/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geneticalgorithm;

import java.util.ArrayList;

/**
 *
 * @author Adrian
 */
public class Population {
    
    public ArrayList<Individual> individuals = new ArrayList<>();
    public Double bestFitness = 0.0;
    public Individual elite;
    
    public void generatePopulation() {
        
        for (int i = 0; i < GA.populationNumber; i++) {
            Individual individual = new Individual();
            individual.generateIndividual();
            individuals.add(individual);   
        }       
    }
    
    public void fitnessTest() {
        for(int i = 0; i < individuals.size(); i++){
            Double newFitness = getFitness(individuals.get(i).genes);
            individuals.get(i).fitness = newFitness;
            if(newFitness > bestFitness) {
                bestFitness = newFitness;
                elite = individuals.get(i);
            }
        }
    }
    
    public Double getbestFitness() {
        return bestFitness;
    }
    
    public Double getFitness(Integer[] genes) {       
        
        Double rmspe = 1.0 - Math.sqrt(1.0 / GA.chromosomeLength * squaredSum(genes));
        return rmspe;
    }
    
    public Double squaredSum(Integer[] genes) {
        
        double sum = 0;
        for (int i = 2; i < GA.chromosomeLength + 2; i++) {
            sum += Math.pow((GA.firstTable.get(i) - GA.firstTable.get(i - genes[i-2])) / GA.firstTable.get(i), 2);
        }
        return sum;
    }  
    
    public Individual getElite() {
        return elite;
    }
    
    public void countRuletteProbabilities(){
        Double fitnessSum = sumAllFitness();
        for(Individual individual : individuals){
            individual.probability = (individual.fitness / fitnessSum);
        } 
    }
    
    public Double sumAllFitness(){
        Double fitnessSum = 0.0;
        for(Individual individual : individuals){
            fitnessSum += individual.fitness;
        } 
        return fitnessSum;
    }       
}
