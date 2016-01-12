/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculos;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Sergio M
 */
public class Calculos {
        
    public static Float get_mediaF(ArrayList <Float> v)
    {
        float result = 0;       
        for(int i = 0; i < v.size();i++)
        {
            result += v.get(i);  
        }       
        return result/v.size();        
    }
    
        public static Float get_mediaI(ArrayList <Integer> v)
    {
        float result = 0;       
        for(int i = 0; i < v.size();i++)
        {
            result += v.get(i);  
        }       
        return result/v.size();        
    }
        
        public static float get_max(ArrayList <Float> f)
        {
            return Collections.max(f);
        }
        
        public static float get_min(ArrayList <Float> f)
        {
            return Collections.min(f);
        }
        
        public static String get_mes (int n)
        {
            String tmp = "";
            switch(n)
            {
                case 1:
                    tmp = "Enero";
                    break;
                case 2:
                    tmp = "Febrero";
                    break;
                case 3:
                    tmp = "Marzo";
                    break;
                case 4:
                    tmp = "Abril";
                    break;
                case 5:
                    tmp = "Mayo";
                    break;
                case 6:
                    tmp = "Junio";
                    break;
                case 7:
                    tmp = "Julio";
                    break;
                case 8:
                    tmp = "Agosto";
                    break;
                case 9:
                    tmp = "Septiembre";
                    break;
                case 10:
                    tmp = "Octubre";
                    break;
                case 11:
                    tmp = "Noviembre";
                    break;
                case 12:
                    tmp = "Diciembre";
                    break;
                default:
                    tmp = "";
                    break;
            }
            return tmp;
        }
    
}
