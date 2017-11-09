/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.metier;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.sid.dao.AbsenceDao;
import org.sid.entite.AbsenceId;
import org.sid.entite.Cours;
import org.sid.entite.Etudiant;





/**
 *
 * @author Lenovo
 */
@ManagedBean
@SessionScoped
public class AbsenceBean implements Serializable{
     private AbsenceId id;
     private Cours cours;
     private Etudiant etudiant;
     private String type;

    public AbsenceBean() {
    }
    
    public void init(){
		System.out.println("Ca marche........");
	}

	
    public AbsenceBean(AbsenceId id, Cours cours, Etudiant etudiant) {
        this.id = id;
        this.cours = cours;
        this.etudiant = etudiant;
    }
    public AbsenceBean(AbsenceId id, Cours cours, Etudiant etudiant, String type) {
       this.id = id;
       this.cours = cours;
       this.etudiant = etudiant;
       this.type = type;
    }
    
    
    
  
    public AbsenceId getId() {
        return this.id;
    }
    
    public void setId(AbsenceId id) {
        this.id = id;
    }
    public Cours getCours() {
        return this.cours;
    }
    
    public void setCours(Cours cours) {
        this.cours = cours;
    }
    public Etudiant getEtudiant() {
        return this.etudiant;
    }
    
    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
        System.out.println("Vous etes");
    }
    
    public void ajouterAbsence(){
        AbsenceDao absence = new AbsenceDao();
        
    }
}
