/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRC7.Observer;

import PRC7.Observable.MonthData;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Sergio
 */
public class MonthDisplay implements Observer{

    MonthData monthobs = new MonthData();
    @Override
    public void update(Observable o, Object arg) {
        monthobs = (MonthData) o;
        display();
    }
    public void display()
    {
        //monthobs.getYeardata();
        System.out.println("Mes: "+monthobs.getdata());
    }
    
}
