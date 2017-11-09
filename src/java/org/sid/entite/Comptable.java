package org.sid.entite ;


import java.util.HashSet;
import java.util.Set;

/**
 * Comptable generated by hbm2java
 */
public class Comptable  implements java.io.Serializable {


     private String codeutilisateur;
     private Utilisateur utilisateur;
     private Set<Facture> factures = new HashSet<Facture>(0);

    public Comptable() {
    }

	
    public Comptable(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public Comptable(Utilisateur utilisateur, Set<Facture> factures) {
       this.utilisateur = utilisateur;
       this.factures = factures;
    }
   
    public String getCodeutilisateur() {
        return this.codeutilisateur;
    }
    
    public void setCodeutilisateur(String codeutilisateur) {
        this.codeutilisateur = codeutilisateur;
    }
    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    }
    
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public Set<Facture> getFactures() {
        return this.factures;
    }
    
    public void setFactures(Set<Facture> factures) {
        this.factures = factures;
    }




}

