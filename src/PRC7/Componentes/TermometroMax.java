/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRC7.Componentes;

import Calculos.Calculos;
import Interfaces.iGraficos;
import PRC7.Dash;
import PRC7.Dataset;
import java.awt.BasicStroke;
import java.awt.Color;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.ThermometerPlot;
import static org.jfree.chart.plot.ThermometerPlot.*;
import org.jfree.data.general.DefaultValueDataset;

/**
 *
 * @author Sergio
 */
public class TermometroMax implements iGraficos{

    Dataset datos;
    Dash ventana;
    ChartPanel panel;
    JFreeChart chart = null;
    
    public TermometroMax(Dataset d, Dash v)
    {
        datos = d;
        ventana = v;
    }
    
    @Override
    public void pintar(javax.swing.JPanel p,int pos) {
        p.removeAll();
        DefaultValueDataset data = new DefaultValueDataset(new Double(ventana.getGraphdata().getTmax()));
        
        ThermometerPlot plot = new ThermometerPlot(data);
        chart = new JFreeChart("Temperatura Maxima, \nMES: "+ Calculos.get_mes(ventana.getMonthdata().getdata()),  // chart title
                                  JFreeChart.DEFAULT_TITLE_FONT,
                                  plot,                 // plot
                                  false);
        
        
        Color Darkorange = new Color (255, 140, 0);        
        Color Crimson = new Color (220, 20, 60);        
        Color Aquamarine = new Color (127, 255, 212);
        Color Darkslategray = new Color(47, 79, 79);
        
        plot.setMercuryPaint(Aquamarine);
        plot.setSubrange(NORMAL, 0, 10);
        plot.setSubrange(WARNING, 10.1, 20);
        plot.setSubrange(CRITICAL, 20.1, 50);
        plot.setSubrangePaint(NORMAL, Aquamarine);
        plot.setSubrangePaint(WARNING, Darkorange);
        plot.setSubrangePaint(CRITICAL, Crimson);
                
        
        plot.setThermometerStroke(new BasicStroke(2.0f));
        plot.setThermometerPaint(Darkslategray);
        
        plot.setDisplayRange(5, Calculos.get_min(datos.getTmax()), Calculos.get_max(datos.getTmax()));
        plot.setRange(Calculos.get_min(datos.getTmax()), Calculos.get_max(datos.getTmax()));
        

        
        panel = new ChartPanel(chart);
        panel.setBounds(5,5,300,300);
        panel.repaint();
        p.add(panel);
        // jPanel1.repaint();
        p.updateUI();
       // añoIndex=añoAux;
        ///añoAux = 0;
    }    
}
