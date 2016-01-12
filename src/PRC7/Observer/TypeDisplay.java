/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRC7.Observer;

import PRC7.Observable.TypeData;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Sergio
 */
public class TypeDisplay implements Observer{

    TypeData typeobs = new TypeData();
    @Override
    public void update(Observable o, Object arg) {
        typeobs = (TypeData) o;
        display();
    }
    public void display()
    {
        //typeobs.getYeardata();
        System.out.println("Type: "+typeobs.getdata());
    }
    
}
