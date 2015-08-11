/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it250.pages;

import it250.data.Soba;
import java.util.ArrayList;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

/**
 *
 * @author Workbench
 */
public class PregledSoba {
    
    @Property
    private Soba soba;
    
    @Property @Persist
    private ArrayList<Soba> listaSoba;
    
    @Property
    private int idValue, spratValue;
    
    @Property
    private boolean tvValue, internetValue, djakuziValue;
    
    
    void onActivate(){
        if(listaSoba == null){
            listaSoba = new ArrayList<Soba>();
        }
    }
    
    Object onSuccess(){
        Soba s = new Soba();
        s.setId(idValue);
        s.setSprat(spratValue);
        s.setDjakuzi(djakuziValue);
        s.setInternet(internetValue);
        s.setTv(tvValue);
        
        listaSoba.add(s);
        return PregledSoba.class;
    }
}
