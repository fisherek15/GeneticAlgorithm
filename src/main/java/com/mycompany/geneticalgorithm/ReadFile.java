/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geneticalgorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Adrian
 */
public class ReadFile {

    public void readFile(File file) throws Exception {
        String line;
        GA.firstTable.clear();
        FileReader fr = new FileReader(file);
        try (BufferedReader br = new BufferedReader(fr)) {
            while ((line = br.readLine()) != null) {
                GA.firstTable.add(Double.parseDouble(line.trim()));
            }
        }
        System.out.println(GA.firstTable.toString());
    }
}
