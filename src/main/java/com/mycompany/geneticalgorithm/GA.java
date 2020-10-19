/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geneticalgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Adrian
 */
public class GA {

    public static int populationNumber;
    public static Double crossoverProbability;
    public static int delay;
    public static int maxGenerationNumber;
    public static Double mutationProbability;
    public static Boolean isElite;
    public static int selectedCrossover;
    public static int selectedMethod;

    public static final ArrayList<Double> firstTable = new ArrayList<>();
    public ArrayList<Individual> newIndividuals = new ArrayList<>();
    public ArrayList<Individual> assistantTable = new ArrayList<>();
    public static int ftsize;
    public static int chromosomeLength;
    public static Double maxFitness;
    public int index;
    public static StringBuilder textResult = new StringBuilder();

    public GA() {
        ftsize = firstTable.size();
        chromosomeLength = firstTable.size() - 2;
        maxFitness = 1.0;
    }

    public void generate() {

        int generationCount = 0;
        Population pop = new Population();
        pop.generatePopulation();
        do {
            pop.fitnessTest();
            textResult.append("Pokolenie: ")
                    .append(++generationCount)
                    .append("\tFitness: ")
                    .append(pop.getbestFitness())
                    .append("\n");
            if (pop.getbestFitness() >= maxFitness || generationCount >= maxGenerationNumber) {
                break;
            }

            createNewPopulation(pop);
            pop.bestFitness = 0.0;
            pop.elite = null;
        } while (true);
        textResult.append("------------- Rozwiazanie -------------\n ")
                .append(Arrays.toString(pop.getElite().genes))
                .append("\n\n");
        XYLineChart lineChart = new XYLineChart(prognoze(pop));
        lineChart.setVisible(true);

    }

    public void createNewPopulation(Population pop) {

        if (isElite) {
            Individual elite = pop.getElite();
            assistantTable.add(0, elite);
        }

        if (selectedMethod == 1) {
            tournamentSelection(pop);
        } else if (selectedMethod == 2) {
            rouletteWheelSelection(pop);
        }

        if (selectedCrossover == 1) {
            geneticOperations(1);
        } else if (selectedCrossover == 2) {
            geneticOperations(2);
        }
        pop.individuals = new ArrayList<>(newIndividuals);
        newIndividuals.clear();
    }

    public void tournamentSelection(Population pop) {
        Random random = new Random();
        for (int i = 0; i < populationNumber; i++) {
            Individual individual1 = pop.individuals.get(random.nextInt(pop.individuals.size()));
            Individual individual2 = pop.individuals.get(random.nextInt(pop.individuals.size()));
            Individual strongerIndividual = (individual1.fitness > individual2.fitness) ? individual1 : individual2;
            assistantTable.add(strongerIndividual);
        }
    }

    public void rouletteWheelSelection(Population pop) {

        pop.countRuletteProbabilities();
        Random random = new Random();
        Double sum, number;
        while (assistantTable.size() < populationNumber) {
            sum = 0.0;
            number = random.nextDouble();
            for (Individual individual : pop.individuals) {
                sum += individual.probability;
                if (number <= sum) {
                    assistantTable.add(individual);
                    break;
                }
            }
        }
    }

    public void geneticOperations(int selectedCrossover) {
        Random random = new Random();
        while (newIndividuals.size() < populationNumber) {
            if (assistantTable.size() > 1) {
                int position1 = random.nextInt(assistantTable.size());
                Individual individual1 = new Individual();
                individual1 = assistantTable.get(position1);
                assistantTable.remove(position1);

                int position2 = random.nextInt(assistantTable.size());
                Individual individual2 = new Individual();
                individual2 = assistantTable.get(position2);
                assistantTable.remove(position2);

                Individual newIndividual1 = new Individual();
                Individual newIndividual2 = new Individual();

                if (random.nextDouble() < crossoverProbability) {
                    if (selectedCrossover == 1) {
                        int crossoverPoint = random.nextInt(chromosomeLength - 2) + 1;
                        newIndividual1 = crossover1Point(crossoverPoint, individual1, individual2);
                        newIndividual2 = crossover1Point(crossoverPoint, individual2, individual1);
                    } else if (selectedCrossover == 2) {
                        int crossoverPoint1, crossoverPoint2;
                        do {
                            crossoverPoint1 = random.nextInt(chromosomeLength);
                            crossoverPoint2 = random.nextInt(chromosomeLength);
                        } while (crossoverPoint1 >= crossoverPoint2);
                        newIndividual1 = crossover2Point(crossoverPoint1, crossoverPoint2, individual1, individual2);
                        newIndividual2 = crossover2Point(crossoverPoint1, crossoverPoint2, individual2, individual1);
                    }
                } else {
                    newIndividual1 = individual1;
                    newIndividual2 = individual2;
                }

                if (random.nextDouble() < mutationProbability) {
                    mutation(newIndividual1);
                    mutation(newIndividual2);
                }
                newIndividuals.add(newIndividual1);
                newIndividuals.add(newIndividual2);
            } else {
                newIndividuals.add(assistantTable.get(0));
            }
        }

    }

    public Individual crossover1Point(int cp, Individual indi1, Individual indi2) {
        Individual newIndi = new Individual();
        for (int i = 0; i < cp; i++) {
            newIndi.genes[i] = indi1.genes[i];
        }
        for (int i = cp; i < chromosomeLength; i++) {
            newIndi.genes[i] = indi2.genes[i];
        }
        return newIndi;
    }

    public Individual crossover2Point(int cp1, int cp2, Individual indi1, Individual indi2) {
        Individual newIndi = new Individual();
        newIndi.genes = Arrays.copyOf(indi1.genes, chromosomeLength);
        for (int i = cp1; i < cp2; i++) {
            newIndi.genes[i] = indi2.genes[i];
        }
        return newIndi;
    }

    public void mutation(Individual newIndi) {

        Random random = new Random();
        int position = random.nextInt(chromosomeLength);
        int gene;
        do {
            gene = random.nextInt(delay) + 1;
        } while (gene == newIndi.genes[position] || ((position + 2) - gene) < 0);
        newIndi.genes[position] = gene;
    }

    public Double[] prognoze(Population pop) {
        Integer[] bestGenes = pop.elite.genes;
        Double[] prognoze = new Double[chromosomeLength];
        for (int i = 2; i < ftsize; i++) {
            prognoze[i - 2] = firstTable.get(i - bestGenes[i - 2]);
        }
        return prognoze;
    }

}
