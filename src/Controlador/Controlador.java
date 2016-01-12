/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Calculos.Calculos;
import Interfaces.iControlador;
import Vista.Dash;
import Vista.Dash;
import Modelo.Dataset;
import Modelo.Dataset;
import Observable.GraphicData;
import java.awt.event.ActionEvent;
import java.util.Observable;

/**
 *
 * @author Sergio
 */
public class Controlador implements iControlador{

    Dash view;
    Dataset model;

    public Controlador(Dash view, Dataset data) {
        this.view = view;
        this.model = data;
    }
    
    public void update (Observable o, Object arg)
    {
        view.setGraphdata((GraphicData)o);
        
        int n = Integer.parseInt(view.getYear().getSelectedItem().toString());
        int ini = view.get_m(n);
        
        view.getTmax_g().pintar(view.getjPanel2(),ini+view.getMonthdata().getdata());
        view.getTmin_g().pintar(view.getjPanel3(),ini+view.getMonthdata().getdata());
        view.getRain_g().pintar(view.getjPanel4(),ini+view.getMonthdata().getdata());
        view.getSun_g().pintar(view.getjPanel5(), ini+view.getMonthdata().getdata());
        view.getAf_g().pintar(view.getjPanel6(),ini+view.getMonthdata().getdata());
    }
    
    public void GetEvent(ActionEvent e)
    {
        if (e.getSource() == view.getPlace())
        {
            view.getPlacedata().setdata((String)view.getPlace().getSelectedItem());
            model.crear_dataset(""+view.getPlacedata().getdata());

            for (int i = 0; i < model.getYear().size();i+=12)
            {
                view.getYear().addItem(model.getYear().get(i));
            }
        }
        else
        {
            if(e.getSource()== view.getYear())
            {
                view.getYeardata().setYeardata(Integer.parseInt(view.getYear().getSelectedItem().toString()));
        
                int n;
                int ini;
                n = Integer.parseInt(view.getYear().getSelectedItem().toString());
                ini = view.get_m(n);
                view.getTmax_g().pintar(view.getjPanel2(),ini);
                view.getTmin_g().pintar(view.getjPanel3(),ini);
                view.getRain_g().pintar(view.getjPanel4(),ini);
                view.getSun_g().pintar(view.getjPanel5(), ini);
                view.getAf_g().pintar(view.getjPanel6(),ini);
            }
            else
                if(e.getSource() == view.getMonthRaise())
                {
                    if(view.getMonthdata().getdata() > 1)
                    {
                        int tmp = view.getMonthdata().getdata()-1;
                        view.getMonthdata().setdata(tmp);

                        int n = Integer.parseInt(view.getYear().getSelectedItem().toString());
                        int ini = view.get_m(n);

                        view.getGraphdata().setTmax(model.getTmax().get(ini+view.getMonthdata().getdata()));
                        view.getGraphdata().setTmin(model.getTmin().get(ini+view.getMonthdata().getdata()));
                        view.getGraphdata().setLluvia(model.getRain().get(ini+view.getMonthdata().getdata()));
                        view.getGraphdata().setHSoleadas(model.getRain().get(ini+view.getMonthdata().getdata()));
                        view.getGraphdata().setDiasHeladas(model.getAfdays().get(ini+view.getMonthdata().getdata()));

                    }
                }
                else
                    if(e.getSource() == view.getMonthGrowth())
                    {
                        if(view.getMonthdata().getdata() < 12)
                        {
                            int tmp = view.getMonthdata().getdata()+1;
                            view.getMonthdata().setdata(tmp);

                            int n = Integer.parseInt(view.getYear().getSelectedItem().toString());
                            int ini = view.get_m(n);
                            view.getGraphdata().setTmax(model.getTmax().get(ini+view.getMonthdata().getdata()));
                            view.getGraphdata().setTmin(model.getTmin().get(ini+view.getMonthdata().getdata()));
                            view.getGraphdata().setLluvia(model.getRain().get(ini+view.getMonthdata().getdata()));
                            view.getGraphdata().setHSoleadas(model.getRain().get(ini+view.getMonthdata().getdata()));
                        }
                    }
            else
                        if(e.getSource() == view.getCrearData1())
                        {
                            Calculos c = new Calculos();
                            float f ;
                            //tmax_v.setText("----");

                            f = (float) (Math.floor(c.get_mediaF(model.getTmax()) * 100) / 100);
                            view.getTmax_v().setText(""+f);
                            f = (float) (Math.floor(c.get_mediaF(model.getTmin()) * 100) / 100);
                            view.getTmin_v().setText(""+f);
                            f = (float) (Math.floor(c.get_mediaI(model.getAfdays()) * 100) / 100);
                            view.getAf_v().setText(""+f);
                            f = (float) (Math.floor(c.get_mediaF(model.getRain()) * 100) / 100);
                            view.getRain_v().setText(""+f);
                            f = (float) (Math.floor(c.get_mediaF(model.getSun())/24 * 100) / 100);
                            view.getSun_v().setText(""+f);
                            //jPanel1.repaint();
                            view.getjPanel1().updateUI();
                        }
        }
    }
}
