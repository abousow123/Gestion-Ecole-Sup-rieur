/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.metier;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.sid.dao.DossierDao;
import org.sid.entite.Dossier;
import org.sid.entite.Etablissement;
import org.sid.entite.Etudiant;
import org.sid.entite.Secretaire;

/**
 *
 * @author sowb
 */
@ManagedBean
@SessionScoped
public class DossierBean implements Serializable{
    
      private String codedossier;
     private Etudiant etudiant;
     private Secretaire secretaire;
     private Date dateCreation;
     private String url;

    public DossierBean(String codedossier, Etudiant etudiant, Secretaire secretaire, Date dateCreation, String url) {
        this.codedossier = codedossier;
        this.etudiant = etudiant;
        this.secretaire = secretaire;
        this.dateCreation = dateCreation;
        this.url = url;
    }

    public void ajoutDossier(){
        Dossier dossier = new Dossier() ;
        DossierDao dao = new DossierDao() ;
        dossier.setCodedossier(codedossier);
        dossier.setDateCreation(dateCreation);
        dossier.setEtudiant(etudiant);
        dossier.setSecretaire(secretaire);
        dossier.setUrl(url);
        
        dao.addDossier(dossier);
    }
    
    public String getCodedossier() {
        return codedossier;
    }

    public void setCodedossier(String codedossier) {
        this.codedossier = codedossier;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Secretaire getSecretaire() {
        return secretaire;
    }

    public void setSecretaire(Secretaire secretaire) {
        this.secretaire = secretaire;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
     
     
    
    
}
