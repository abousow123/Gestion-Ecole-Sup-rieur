/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.metier;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.sid.dao.PaiementDao;
import org.sid.entite.Etudiant;
import org.sid.entite.Facture;
import org.sid.entite.Paiement;

/**
 *
 * @author sow-a
 */

@ManagedBean
@SessionScoped
public class PaiementBean implements Serializable{
    
     private String codepaiement;
     private Etudiant etudiant;
     private Facture facture;
     private String couverture;
     private String scolarite;
     private String datePaiement;

    public PaiementBean(String codepaiement, Etudiant etudiant, Facture facture, String couverture, String scolarite, String datePaiement) {
        this.codepaiement = codepaiement;
        this.etudiant = etudiant;
        this.facture = facture;
        this.couverture = couverture;
        this.scolarite = scolarite;
        this.datePaiement = datePaiement;
    }

      public void ajoutPaiment(){
          Paiement paiement = new Paiement();
          PaiementDao dao = new PaiementDao() ;
          paiement.setCodepaiement(codepaiement);
          paiement.setCouverture(couverture);
          paiement.setDatePaiement(datePaiement);
          paiement.setEtudiant(etudiant);
          paiement.setFacture(facture);
          paiement.setScolarite(scolarite);
          
          dao.addPaiement(paiement);
      }
    
    public String getCodepaiement() {
        return codepaiement;
    }

    public void setCodepaiement(String codepaiement) {
        this.codepaiement = codepaiement;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public String getCouverture() {
        return couverture;
    }

    public void setCouverture(String couverture) {
        this.couverture = couverture;
    }

    public String getScolarite() {
        return scolarite;
    }

    public void setScolarite(String scolarite) {
        this.scolarite = scolarite;
    }

    public String getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(String datePaiement) {
        this.datePaiement = datePaiement;
    }
     
    
    
     
     
    
}
