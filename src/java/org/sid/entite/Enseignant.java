package org.sid.entite ;


import java.util.HashSet;
import java.util.Set;


public class Enseignant  implements java.io.Serializable {

     private String codeutilisateur;
     private Utilisateur utilisateur;
     private String grade;
     private String status;
     private Set<Cours> courses = new HashSet<Cours>(0);
     private EnseignantResponsable enseignantResponsable;

    public Enseignant() {
    }

	
    public Enseignant(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public Enseignant(Utilisateur utilisateur, String grade, String status, Set<Cours> courses, EnseignantResponsable enseignantResponsable) {
       this.utilisateur = utilisateur;
       this.grade = grade;
       this.status = status;
       this.courses = courses;
       this.enseignantResponsable = enseignantResponsable;
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
    public String getGrade() {
        return this.grade;
    }
    
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Set<Cours> getCourses() {
        return this.courses;
    }
    
    public void setCourses(Set<Cours> courses) {
        this.courses = courses;
    }
    public EnseignantResponsable getEnseignantResponsable() {
        return this.enseignantResponsable;
    }
    
    public void setEnseignantResponsable(EnseignantResponsable enseignantResponsable) {
        this.enseignantResponsable = enseignantResponsable;
    }




}


