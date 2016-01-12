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
public class GraphicData extends Observable{
    private float Tmax;
    private float Tmin;
    private int grafico;
    private int diasHeladas;
    private float lluvia;
    private float HSoleadas;

    public float getHSoleadas() {
        return HSoleadas;
    }

    public void setHSoleadas(float HSoleadas) {
        this.HSoleadas = HSoleadas;
        setChanged();
	notifyObservers();
    }
    
    
    

    public float getLluvia() {
        return lluvia;
    }

    public void setLluvia(float lluvia) {
        this.lluvia = lluvia;
        setChanged();
	notifyObservers();
    }
    
    
    
    

    public int getDiasHeladas() {
        return diasHeladas;
    }

   public void setDiasHeladas(int diasHeladas) {
        this.diasHeladas = diasHeladas;
        setChanged();
	notifyObservers();
    }
    
    

    public int getGrafico() {
        return grafico;
    }

    public void setGrafico(int grafico) {
        this.grafico = grafico;
        setChanged();
	notifyObservers();
    }

  
    
    

    public float getTmax() {
        return Tmax;
    }

    public void setTmax(float Tmax) {
        this.Tmax = Tmax;
        setChanged();
	notifyObservers();
    }

    public float getTmin() {
        return Tmin;
    }

    public void setTmin(float Tmin) {
        this.Tmin = Tmin;
        setChanged();
	notifyObservers();
    } 
    
}
