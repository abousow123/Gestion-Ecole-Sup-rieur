/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.metier ;


import java.io.Serializable;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.context.ApplicationContext;
import org.sid.dao.SecretaireDao;
import org.sid.dao.UtilisateurDao;
import org.sid.entite.Secretaire;
import org.sid.entite.Utilisateur;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Lenovo
 */
@ManagedBean
@SessionScoped
public class SecretaireBean implements Serializable{
     private String codeutilisateur;
     private String nom;
     private String prenom;
     private String datedenaissance;
     private String lieudenaissance;
     private String situationMatrimonial;
     private String telephone;
     private String adresse;
     private String nationalite ;
     
     private String email;
     
     private String login;
     private String password;
     private String sms;

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }
     
// private static BeanFactory factory;
//	static{
//		ApplicationContext context = new ClassPathXmlApplicationContext(new String [ ] {"/WEB-INF/applicationContext.xml"});
//		factory = context;
//	}


    public SecretaireBean() {
    }

	
    public SecretaireBean(String codeutilisateur) {
        this.codeutilisateur = codeutilisateur;
    }

    public String getCodeutilisateur() {
        return codeutilisateur;
    }

    public void setCodeutilisateur(String codeutilisateur) {
        this.codeutilisateur = codeutilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDatedenaissance() {
        return datedenaissance;
    }

    public void setDatedenaissance(String datedenaissance) {
        this.datedenaissance = datedenaissance;
    }

    public String getSituationMatrimonial() {
        return situationMatrimonial;
    }

    public void setSituationMatrimonial(String situationMatrimonial) {
        this.situationMatrimonial = situationMatrimonial;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

   
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLieudenaissance() {
        return lieudenaissance;
    }

    public void setLieudenaissance(String lieudenaissance) {
        this.lieudenaissance = lieudenaissance;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }
    
    
    public void ajouterUser(){
        UtilisateurDao userDao = new UtilisateurDao();
        SecretaireDao secretDao= new SecretaireDao();
        //Utilisateur user=(Utilisateur)factory.getBean("utilisateur");
        Utilisateur user = new Utilisateur() ;
        user.setCodeutilisateur("800");
        user.setNom(nom);
        user.setPrenom(prenom);
        user.setDatedenaissance(datedenaissance);
        
        user.setTelephone(telephone);
        user.setAdresse(adresse);
        
        user.setEmail(email);
       
        user.setLogin(nom+prenom+"@ucad.com");
        user.setNationalite(nationalite);
        user.setLieudenaissance(lieudenaissance);
        if(userDao.addUtilisateur(user)){
           // Secretaire secret=(Secretaire) factory.getBean("secretaire");
        	Secretaire secret = new Secretaire() ;
            secret.setCodeutilisateur(userDao.selectionUsersByCall(telephone).getCodeutilisateur());
            user.setCodeutilisateur(userDao.selectionUsersByCall(telephone).getCodeutilisateur());
            secret.setUtilisateur(user);
            secretDao.addSecretaire(secret);
         }
        this.sms= "Member Info Saved Successfull!";
        effacerAll();
    }

    private void effacerAll() {
         this.nom = "";
        this.prenom = "";
        this.datedenaissance = "";
        this.situationMatrimonial = "";
        this.telephone = "";
        this.adresse = "";
        
        
        this.email = "";
       
        
        this.login = "";
        this.password = "";
    }
    
}
