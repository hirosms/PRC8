/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observable;

import java.util.Observable;

/**
 *
 * @author Sergio
 */
public class YearData extends Observable{
    private int yeardata;

    public int getYeardata() {
        return yeardata;
    }

    public void setYeardata(int yeardata) {
        this.yeardata = yeardata;
        setChanged();
        notifyObservers();
    }
    
    
}
