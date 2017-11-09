package org.sid.entite ;


import java.util.HashSet;
import java.util.Set;

/**
 * Secretaire generated by hbm2java
 */
public class Secretaire  implements java.io.Serializable {


     private String codeutilisateur;
     private Utilisateur utilisateur;
     private Set<Dossier> dossiers = new HashSet<Dossier>(0);

    public Secretaire() {
    }

	
    public Secretaire(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public Secretaire(Utilisateur utilisateur, Set<Dossier> dossiers) {
       this.utilisateur = utilisateur;
       this.dossiers = dossiers;
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
    public Set<Dossier> getDossiers() {
        return this.dossiers;
    }
    
    public void setDossiers(Set<Dossier> dossiers) {
        this.dossiers = dossiers;
    }




}


