/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.metier ;


import java.io.Serializable;
import org.sid.dao.ClasseDao;
import org.sid.entite.Classe;

import org.sid.entite.Filiere;
import org.sid.entite.Niveau;

/**
 *
 * @author Lenovo
 */
public class ClasseBean implements Serializable{
     private String codeclasse;
     private Filiere filiere;
     private Niveau niveau;
     private String lbelleClasse;
     private Integer nombreeEtudiant;
     private String type;

    public ClasseBean(String codeclasse, String lbelleClasse, Integer nombreeEtudiant, String type) {
        this.codeclasse = codeclasse;
        this.lbelleClasse = lbelleClasse;
        this.nombreeEtudiant = nombreeEtudiant;
        this.type = type;
    }

    public ClasseBean(String codeclasse, Filiere filiere, Niveau niveau, String lbelleClasse, Integer nombreeEtudiant, String type) {
        this.codeclasse = codeclasse;
        this.filiere = filiere;
        this.niveau = niveau;
        this.lbelleClasse = lbelleClasse;
        this.nombreeEtudiant = nombreeEtudiant;
        this.type = type;
    }

    public ClasseBean() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void ajoutClasse(){
        Classe classe = new Classe() ;
        ClasseDao classeDao = new ClasseDao() ;
        classe.setCodeclasse(codeclasse);
        classe.setLbelleClasse(lbelleClasse);
        classe.setFiliere(filiere);
        classe.setNiveau(niveau);
        classe.setNombreeEtudiant(nombreeEtudiant);
        classe.setType(type);
        classeDao.addClasse(classe) ;
        
    }
    

    public String getCodeclasse() {
        return codeclasse;
    }

    public void setCodeclasse(String codeclasse) {
        this.codeclasse = codeclasse;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public String getLbelleClasse() {
        return lbelleClasse;
    }

    public void setLbelleClasse(String lbelleClasse) {
        this.lbelleClasse = lbelleClasse;
    }

    public Integer getNombreeEtudiant() {
        return nombreeEtudiant;
    }

    public void setNombreeEtudiant(Integer nombreeEtudiant) {
        this.nombreeEtudiant = nombreeEtudiant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
     
     
}
