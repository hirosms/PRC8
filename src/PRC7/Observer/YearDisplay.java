/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRC7.Observer;

import PRC7.Observable.YearData;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Sergio
 */
public class YearDisplay implements Observer{

    YearData yearobs = new YearData();
    @Override
    public void update(Observable o, Object arg) {
        yearobs = (YearData) o;
        display();
    }
    public void display()
    {
        //yearobs.getYeardata();
        System.out.println("Año: "+yearobs.getYeardata());
    }
    
}
