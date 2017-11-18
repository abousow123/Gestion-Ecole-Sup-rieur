/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.metier;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.DefaultScheduleEvent;

/**
 *
 * @author sowb
 */
@ManagedBean
@SessionScoped
public class Utile extends DefaultScheduleEvent{
     private String choixSg="secretaire";
    private String choixProf="Professe";
    
    public Utile(){
        super();
    }
    

    public String getChoixSg() {
        return choixSg;
    }

    public void setChoixSg(String choixSg) {
        this.choixSg = choixSg;
    }

    public String getChoixProf() {
        return choixProf;
    }

    public void setChoixProf(String choixProf) {
        this.choixProf = choixProf;
    }
    
}
