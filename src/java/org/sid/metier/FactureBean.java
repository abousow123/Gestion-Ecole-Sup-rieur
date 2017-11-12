/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.metier;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.sid.dao.FactureDao;
import org.sid.entite.Comptable;
import org.sid.entite.Facture;
import org.sid.entite.Paiement;

/**
 *
 * @author sow-a
 */
@ManagedBean
@SessionScoped
public class FactureBean implements Serializable{
    
     private String codefacture;
     private Comptable comptable;
     private Paiement paiement;
     private Date dateFacture;
     private BigDecimal arriere;
     private BigDecimal montant;
     private String anneeScolaire;

    public FactureBean(String codefacture, Comptable comptable, Paiement paiement, Date dateFacture, BigDecimal arriere, BigDecimal montant, String anneeScolaire) {
        this.codefacture = codefacture;
        this.comptable = comptable;
        this.paiement = paiement;
        this.dateFacture = dateFacture;
        this.arriere = arriere;
        this.montant = montant;
        this.anneeScolaire = anneeScolaire;
    }
    
    
    public void ajoutFacture(){
        Facture f = new Facture() ;
        FactureDao dao = new FactureDao() ;
        
        f.setAnneeScolaire(anneeScolaire);
        f.setArriere(arriere);
        f.setCodefacture(codefacture);
        f.setComptable(comptable);
        f.setDateFacture(dateFacture);
        f.setMontant(montant);
        f.setPaiement(paiement);
        
        dao.addFacture(f);
    }

    public String getCodefacture() {
        return codefacture;
    }

    public void setCodefacture(String codefacture) {
        this.codefacture = codefacture;
    }

    public Comptable getComptable() {
        return comptable;
    }

    public void setComptable(Comptable comptable) {
        this.comptable = comptable;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public BigDecimal getArriere() {
        return arriere;
    }

    public void setArriere(BigDecimal arriere) {
        this.arriere = arriere;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getAnneeScolaire() {
        return anneeScolaire;
    }

    public void setAnneeScolaire(String anneeScolaire) {
        this.anneeScolaire = anneeScolaire;
    }
     
     
     
    
}
