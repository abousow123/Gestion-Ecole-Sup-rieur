package org.sid.entite ;
// Generated 20 sept. 2017 20:45:31 by Hibernate Tools 4.3.1



/**
 * Administrateur generated by hbm2java
 */
public class Administrateur  implements java.io.Serializable {


     private String codeutilisateur;
     private Utilisateur utilisateur;

    public Administrateur() {
    }

    public Administrateur(Utilisateur utilisateur) {
       this.utilisateur = utilisateur;
    }

    public Administrateur(String codeutilisateur, Utilisateur utilisateur) {
        this.codeutilisateur = codeutilisateur;
        this.utilisateur = utilisateur;
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




}


