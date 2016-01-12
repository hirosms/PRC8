/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import Observable.PlaceData;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Sergio
 */
public class PlaceDisplay implements Observer{

    PlaceData placeobs = new PlaceData();
    @Override
    public void update(Observable o, Object arg) {
        placeobs = (PlaceData) o;
        display();
    }
    public void display()
    {
        //placeobs.getYeardata();
        System.out.println("Lugar: "+placeobs.getdata());
    }
    
}
