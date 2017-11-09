package org.sid.entite ;


import java.util.HashSet;
import java.util.Set;

/**
 * Etudiant generated by hbm2java
 */
public class Etudiant  implements java.io.Serializable {


     private String codeutilisateur;
     private Classe classe;
     private Utilisateur utilisateur;
     private String responsableclasse;
     private Set<Evaluer> evaluers = new HashSet<Evaluer>(0);
     private Set<Paiement> paiements = new HashSet<Paiement>(0);
     private Set<Dossier> dossiers = new HashSet<Dossier>(0);
     private Set<Absence> absences = new HashSet<Absence>(0);

    public Etudiant() {
    }

	
    public Etudiant(Classe classe, Utilisateur utilisateur) {
        this.classe = classe;
        this.utilisateur = utilisateur;
    }
    
    

    public String getCodeutilisateur() {
        return this.codeutilisateur;
    }
    
    public void setCodeutilisateur(String codeutilisateur) {
        this.codeutilisateur = codeutilisateur;
    }
    public Classe getClasse() {
        return this.classe;
    }
    
    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    }
    
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public String getResponsableclasse() {
        return this.responsableclasse;
    }
    
    public void setResponsableclasse(String responsableclasse) {
        this.responsableclasse = responsableclasse;
    }
    public Set<Evaluer> getEvaluers() {
        return this.evaluers;
    }
    
    public void setEvaluers(Set<Evaluer> evaluers) {
        this.evaluers = evaluers;
    }
    public Set<Paiement> getPaiements() {
        return this.paiements;
    }
    
    public void setPaiements(Set<Paiement> paiements) {
        this.paiements = paiements;
    }
    public Set<Dossier> getDossiers() {
        return this.dossiers;
    }
    
    public void setDossiers(Set<Dossier> dossiers) {
        this.dossiers = dossiers;
    }
    public Set<Absence> getAbsences() {
        return this.absences;
    }
    
    public void setAbsences(Set<Absence> absences) {
        this.absences = absences;
    }
}


