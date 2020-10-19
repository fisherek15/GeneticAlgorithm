/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geneticalgorithm;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/**
 *
 * @author Adrian
 */
public class XYLineChart extends JFrame {

    private final Double[] prognoze;

    public XYLineChart(Double[] prognoze) {

        this.prognoze = Arrays.copyOf(prognoze, prognoze.length);

        JPanel chartPanel = createChartPanel();
        this.add(chartPanel, BorderLayout.CENTER);
        this.setSize(690, 450);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    private JPanel createChartPanel() {

        String chartTitle = "Prognozowane wyniki";
        String yAxisLabel = "USD/PLN";
        String xAxisLabel = "Numer dnia obserwacji";
        XYDataset dataset = createDataset();

        final JFreeChart chart = ChartFactory.createXYLineChart(chartTitle,
                xAxisLabel, yAxisLabel, dataset, PlotOrientation.VERTICAL, true, true, false);

        XYPlot xyPlot = (XYPlot) chart.getPlot();
        xyPlot.setDomainCrosshairVisible(true);
        xyPlot.setRangeCrosshairVisible(true);
        xyPlot.setBackgroundPaint(Color.WHITE);
        xyPlot.setRangeGridlinesVisible(true);
        xyPlot.setRangeGridlinePaint(Color.LIGHT_GRAY);
        xyPlot.setDomainGridlinesVisible(true);
        xyPlot.setDomainGridlinePaint(Color.LIGHT_GRAY);

        NumberAxis domain = (NumberAxis) xyPlot.getDomainAxis();
        domain.setAutoRange(true);
        domain.setAutoTickUnitSelection(true);
        domain.setVerticalTickLabels(false);
        
        NumberAxis range = (NumberAxis) xyPlot.getRangeAxis();
        range.setAutoRangeIncludesZero(false);
        range.setAutoTickUnitSelection(true);
        
        XYItemRenderer renderer = xyPlot.getRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesPaint(1, Color.BLUE);

        renderer.setSeriesStroke(0, new BasicStroke(1.5f));
        renderer.setSeriesStroke(1, new BasicStroke(1.5f));
        xyPlot.setRenderer(renderer);
        return new ChartPanel(chart);
    }

    private XYDataset createDataset() {

        XYSeries series1 = new XYSeries("Dane rzeczywiste");
        XYSeries series2 = new XYSeries("Prognoza");

        int i = 0;
        for (Double value : GA.firstTable) {
            i++;
            series1.add(i, value);
        }

        int j = 2;
        for (Double value : prognoze) {
            j++;
            series2.add(j, value);
        }
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series1);
        dataset.addSeries(series2);

        return dataset;
    }
}
