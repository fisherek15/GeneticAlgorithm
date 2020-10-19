/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geneticalgorithm;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Adrian
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        buttonSearchFile = new javax.swing.JButton();
        labelSelectFile = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sliderCrossover = new javax.swing.JSlider();
        textfieldCrossoverProbability = new javax.swing.JTextField();
        radiobuttonCrossover1Point = new javax.swing.JRadioButton();
        radiobuttonCrossover2Point = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        sliderMutation = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        comboboxSelectionMethod = new javax.swing.JComboBox();
        checkboxElite = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        textfieldMaxGenNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textfieldDelay = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textfieldPopulationNumber = new javax.swing.JTextField();
        textfieldMutationProbability = new javax.swing.JTextField();
        buttonPrognoze = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaResult = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prognozer walut 1.0v");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dane wejściowe"));

        buttonSearchFile.setText("Wybierz plik");
        buttonSearchFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchFileActionPerformed(evt);
            }
        });

        labelSelectFile.setText("nie wybrano pliku...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSearchFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelSelectFile, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(buttonSearchFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSelectFile)
                .addGap(5, 5, 5))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ustawienia"));

        jLabel2.setText("Prawdopodob. krzyżowania");

        sliderCrossover.setMinimum(50);
        sliderCrossover.setValue(80);
        sliderCrossover.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderCrossoverStateChanged(evt);
            }
        });

        textfieldCrossoverProbability.setText("0.8");

        buttonGroup1.add(radiobuttonCrossover1Point);
        radiobuttonCrossover1Point.setSelected(true);
        radiobuttonCrossover1Point.setText("krzyżowanie jednopunktowe");

        buttonGroup1.add(radiobuttonCrossover2Point);
        radiobuttonCrossover2Point.setText("krzyżowanie dwupunktowe");

        jLabel3.setText("Prawdopodob. mutacji");

        sliderMutation.setMaximum(15);
        sliderMutation.setValue(5);
        sliderMutation.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderMutationStateChanged(evt);
            }
        });

        jLabel4.setText("Metoda selekcji");

        comboboxSelectionMethod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "turniejowa", "ruletki" }));

        checkboxElite.setText("osobnik elitarny");

        jLabel5.setText("Max. ilość pokoleń");

        textfieldMaxGenNumber.setText("50");

        jLabel6.setText("Opóźnienie");

        textfieldDelay.setText("5");

        jLabel7.setText("Wielkość populacji");

        textfieldPopulationNumber.setText("400");

        textfieldMutationProbability.setText("0.05");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfieldMaxGenNumber))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sliderCrossover, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfieldCrossoverProbability))
                    .addComponent(radiobuttonCrossover1Point)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfieldMutationProbability))
                    .addComponent(sliderMutation, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(radiobuttonCrossover2Point)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboboxSelectionMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkboxElite))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textfieldDelay))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textfieldPopulationNumber))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textfieldCrossoverProbability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderCrossover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radiobuttonCrossover1Point)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radiobuttonCrossover2Point)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textfieldMutationProbability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderMutation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboboxSelectionMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkboxElite)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textfieldMaxGenNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textfieldPopulationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textfieldDelay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        buttonPrognoze.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonPrognoze.setText("Prognozuj");
        buttonPrognoze.setEnabled(false);
        buttonPrognoze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrognozeActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Generowanie"));

        textAreaResult.setColumns(20);
        textAreaResult.setRows(5);
        jScrollPane1.setViewportView(textAreaResult);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPrognoze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPrognoze, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSearchFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchFileActionPerformed

        JFileChooser chooser = new JFileChooser();
        File defaultPath = new File("./kursyWalut");        
        chooser.setCurrentDirectory(defaultPath);
        chooser.setFileFilter(new FileNameExtensionFilter("Notepad (*.txt)", "txt"));     
        chooser.showOpenDialog(null);        
        File file = chooser.getSelectedFile();
        String filename = file.getName();
        labelSelectFile.setText(filename);
        ReadFile rf = new ReadFile();
        try {
            rf.readFile(file);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            buttonPrognoze.setEnabled(true);
        }
    }//GEN-LAST:event_buttonSearchFileActionPerformed

    private void buttonPrognozeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrognozeActionPerformed

        buttonPrognoze.setEnabled(false);
        buttonSearchFile.setEnabled(false);
              
        GA.populationNumber = Integer.parseInt(textfieldPopulationNumber.getText());
        GA.crossoverProbability = Double.parseDouble(textfieldCrossoverProbability.getText());
        GA.mutationProbability = Double.parseDouble(textfieldMutationProbability.getText());
        GA.delay = Integer.parseInt(textfieldDelay.getText());
        GA.maxGenerationNumber = Integer.parseInt(textfieldMaxGenNumber.getText());
        GA.isElite = checkboxElite.isSelected();
        
        if(radiobuttonCrossover1Point.isSelected()){
            GA.selectedCrossover = 1;
        } else if (radiobuttonCrossover2Point.isSelected()){
            GA.selectedCrossover = 2;
        }
        
        if(comboboxSelectionMethod.getSelectedIndex() == 0) {
            GA.selectedMethod = 1;
        } else if(comboboxSelectionMethod.getSelectedIndex() == 1) {
            GA.selectedMethod = 2;
        }

        GA ga = new GA();
        ga.generate();
        textAreaResult.setText(GA.textResult.toString());        
        buttonSearchFile.setEnabled(true);
        buttonPrognoze.setEnabled(true);
    }//GEN-LAST:event_buttonPrognozeActionPerformed

    private void sliderCrossoverStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderCrossoverStateChanged

        Double value = (double)sliderCrossover.getValue() / 100;
        textfieldCrossoverProbability.setText(value.toString());
    }//GEN-LAST:event_sliderCrossoverStateChanged

    private void sliderMutationStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderMutationStateChanged
        
        Double value = (double)sliderMutation.getValue() / 100;
        textfieldMutationProbability.setText(value.toString());
    }//GEN-LAST:event_sliderMutationStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonPrognoze;
    private javax.swing.JButton buttonSearchFile;
    private javax.swing.JCheckBox checkboxElite;
    private javax.swing.JComboBox comboboxSelectionMethod;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelSelectFile;
    private javax.swing.JRadioButton radiobuttonCrossover1Point;
    private javax.swing.JRadioButton radiobuttonCrossover2Point;
    private javax.swing.JSlider sliderCrossover;
    private javax.swing.JSlider sliderMutation;
    private javax.swing.JTextArea textAreaResult;
    private javax.swing.JTextField textfieldCrossoverProbability;
    private javax.swing.JTextField textfieldDelay;
    private javax.swing.JTextField textfieldMaxGenNumber;
    private javax.swing.JTextField textfieldMutationProbability;
    private javax.swing.JTextField textfieldPopulationNumber;
    // End of variables declaration//GEN-END:variables
}
