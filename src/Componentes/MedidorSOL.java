/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import Calculos.Calculos;
import Interfaces.iGraficos;
import Vista.Dash;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Sergio
 */
public class MedidorSOL implements iGraficos{
    Dash ventana;

    public MedidorSOL(Dash ventana) {
        this.ventana = ventana;
    }
    

            
    public void pintar(JPanel p, int pos) {
    Graphics g = p.getGraphics();
    Color Darkgoldenrod  = new Color (184, 134, 11);        
    Color Chartreuse = new Color (127, 255, 0);        
    Color Aquamarine = new Color (127, 255, 212);
    Color Darkslategray = new Color(47, 79, 79);
    
    int val_r = Math.round(ventana.getDataset().getSun().get(pos));
    int val = Math.round((180/Calculos.get_max(ventana.getDataset().getSun()))*val_r);
         
  //p.removeAll();
    p.paint(g);
    //Coordenadas del Panel
      
    g.setColor (Darkslategray);
    //g.drawLine (0, 70, 100, 70);
    //g.fillRect(5,150,150,100);
    
    g.fillArc(10,60,300,200,0,180);
    
    if(val < 45){g.setColor (Darkgoldenrod);}
    else if(val > 46 && val < 135){ g.setColor (Chartreuse);}
    else if (val > 136) { g.setColor (Aquamarine);}
    
    //g.setColor (Chartreuse);
    
    g.fillArc(10,60,300,200,0,val);
    
    g.setColor (Color.black);
    g.setFont( new Font( "SansSerif", Font.BOLD, 18 ) );
    g.drawString( "Horas de SOL: "+ventana.getDataset().getRain().get(pos)+",",10,25);
    g.drawString( "MES: "+Calculos.get_mes(ventana.getMonthdata().getdata()),10,45); 
            
    //g.drawRoundRect (250, 70, 50, 70, 6, 6);
    //g.drawOval (350, 70, 50, 70);
    //int [] vx1 = {500, 550, 450};
    //int [] vy1 = {70, 120, 120};
    //g.drawPolygon (vx1, vy1, 3);

   // g.setColor (Color.green);
    //g.fillRect (150, 270, 50, 70);
    //g.fillRoundRect (250, 270, 50, 70, 6, 6);
    //g.fillOval (350, 270, 50, 70);
    //int [] vx2 = {500, 550, 450};
    //int [] vy2 = {270, 320, 320};
    //g.fillPolygon (vx2, vy2, 3);
    
    //p.repaint();
    //p.updateUI();
    
   
    
    
    }
    
}
