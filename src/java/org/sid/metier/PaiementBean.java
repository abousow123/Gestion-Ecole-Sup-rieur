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
import org.sid.dao.EtudiantDao;
import org.sid.dao.PaiementDao;
import org.sid.entite.Etudiant;
import org.sid.entite.Facture;
import org.sid.entite.Paiement;
import org.sid.entite.Utilisateur;

/**
 *
 * @author sow-a
 */

@ManagedBean
@SessionScoped
public class PaiementBean implements Serializable{
    
     private String codepaiement;
     private Etudiant etudiant;
     private String codeUser ;
     private String montant;
     private String nbmois;
     private String couverture;
     private String scolarite;
     private Date datePaiement;

    public PaiementBean() {
    }
     
     

    public PaiementBean(String codepaiement, String etudiant,String couverture, String scolarite, Date datePaiement) {
        this.codepaiement = codepaiement;
        this.codeUser = etudiant;
        this.couverture = couverture;
        this.scolarite = scolarite;
        this.datePaiement = datePaiement;
    }

      public void ajoutPaiment(){
          Paiement paiement = new Paiement();
          PaiementDao dao = new PaiementDao() ;
          EtudiantDao ed = new EtudiantDao() ;
          paiement.setCodepaiement("Paie1");
          paiement.setCouverture(couverture);
          
          paiement.setMontant(Double.parseDouble(montant));
          paiement.setNb_mois(Integer.parseInt(nbmois));
           
          datePaiement = new Date() ;
          paiement.setDatePaiement(datePaiement);
          Etudiant e = ed.getEtudiantE(codeUser) ;
          paiement.setEtudiant(e);
          
          paiement.setScolarite(scolarite);
          
          dao.addPaiement(paiement);
          System.out.println("Paiment enregistrer avec succés!!!!!!");
      }
    
    public String getCodepaiement() {
        return codepaiement;
    }

    public String getCodeUser() {
        return codeUser;
    }

    public void setCodeUser(String codeUser) {
        this.codeUser = codeUser;
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

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getNbmois() {
        return nbmois;
    }

    public void setNbmois(String nbmois) {
        this.nbmois = nbmois;
    }
     
    
    
     
     
    
}
