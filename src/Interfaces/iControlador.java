/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Vista.Dash;
import Modelo.Dataset;
import java.awt.event.ActionEvent;
import java.util.Observable;

/**
 *
 * @author Sergio
 */
public interface iControlador {
     public void update (Observable o, Object arg);
     public void GetEvent(ActionEvent e);
}
