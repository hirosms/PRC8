/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRC7.Observable;

import java.util.Observable;

/**
 *
 * @author Sergio
 */
public class MonthData extends Observable{
    private int monthdata;
  
    public int getdata() {
        return monthdata;
    }

    public void setdata(int monthdata) {
        this.monthdata = monthdata;
        setChanged();
        notifyObservers();
    }
    
    
}
