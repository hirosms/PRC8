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
public class TypeData extends Observable{
    private int typedata;

    public int getdata() {
        return typedata;
    }

    public void setdata(int typedata) {
        this.typedata = typedata;
        setChanged();
        notifyObservers();
    }
    
    
}
