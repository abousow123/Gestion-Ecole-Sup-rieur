/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.metier;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.sid.dao.FiliereDao;
import org.sid.entite.Domaine;
import org.sid.entite.EnseignantResponsable;
import org.sid.entite.Filiere;

/**
 *
 * @author sowb
 */

@ManagedBean
@SessionScoped
public class FiliereBean implements Serializable{
    
      private String codefiliere;
     private Domaine domaine;
     private EnseignantResponsable enseignantResponsable;
     private String libelleFiliere;

    public FiliereBean(String codefiliere, String libelleFiliere) {
        this.codefiliere = codefiliere;
        this.libelleFiliere = libelleFiliere;
    }

    public FiliereBean(String codefiliere, Domaine domaine, EnseignantResponsable enseignantResponsable, String libelleFiliere) {
        this.codefiliere = codefiliere;
        this.domaine = domaine;
        this.enseignantResponsable = enseignantResponsable;
        this.libelleFiliere = libelleFiliere;
    }
    
    
    
    public void ajoutFiliere(){
        Filiere filiere = new Filiere() ;
        FiliereDao dao = new FiliereDao() ;
        filiere.setCodefiliere(codefiliere);
        filiere.setLibelleFiliere(libelleFiliere);
        filiere.setDomaine(domaine);
        filiere.setEnseignantResponsable(enseignantResponsable);
        
        dao.addFiliere(filiere);
        
    }
    
    
    

    public String getCodefiliere() {
        return codefiliere;
    }

    public void setCodefiliere(String codefiliere) {
        this.codefiliere = codefiliere;
    }

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }

    public EnseignantResponsable getEnseignantResponsable() {
        return enseignantResponsable;
    }

    public void setEnseignantResponsable(EnseignantResponsable enseignantResponsable) {
        this.enseignantResponsable = enseignantResponsable;
    }

    public String getLibelleFiliere() {
        return libelleFiliere;
    }

    public void setLibelleFiliere(String libelleFiliere) {
        this.libelleFiliere = libelleFiliere;
    }
     
     
    
    
}
