/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.metier;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.sid.dao.DomaineDao;
import org.sid.entite.Domaine;
import org.sid.entite.Etablissement;

/**
 *
 * @author sowb
 */
@ManagedBean
@SessionScoped
public class DomaineBean implements Serializable{
    
     private String codedomaine;
     private Etablissement etablissement;
     private String nomDomaine;

    public DomaineBean(String codedomaine, String nomDomaine) {
        this.codedomaine = codedomaine;
        this.nomDomaine = nomDomaine;
    }

    public DomaineBean(String codedomaine, Etablissement etablissement, String nomDomaine) {
        this.codedomaine = codedomaine;
        this.etablissement = etablissement;
        this.nomDomaine = nomDomaine;
    }

    
    public void ajoutDomaine(){
        Domaine domaine = new Domaine() ;
        DomaineDao dao = new DomaineDao() ;
        
        domaine.setCodedomaine(codedomaine);
        domaine.setEtablissement(etablissement);
        domaine.setNomDomaine(nomDomaine);
        
        dao.addDomaine(domaine);
        
        
    }
    
    
    public String getCodedomaine() {
        return codedomaine;
    }

    public void setCodedomaine(String codedomaine) {
        this.codedomaine = codedomaine;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    public String getNomDomaine() {
        return nomDomaine;
    }

    public void setNomDomaine(String nomDomaine) {
        this.nomDomaine = nomDomaine;
    }
     
     
    
    
    
}
