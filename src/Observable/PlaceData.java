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
public class PlaceData extends Observable{
    private String placedata;

    public String getdata() {
        return placedata;
    }

    public void setdata(String placedata) {
        this.placedata = placedata;
        setChanged();
        notifyObservers();
    }
    
    
}
