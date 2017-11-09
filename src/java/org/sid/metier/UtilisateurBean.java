/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.metier ;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.context.ApplicationContext;
import org.sid.dao.UtilisateurDao;
import org.sid.entite.Administrateur;
import org.sid.entite.Comptable;
import org.sid.entite.Enseignant;
import org.sid.entite.Etudiant;
import org.sid.entite.Message;
import org.sid.entite.Responsable;
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
public class UtilisateurBean implements Serializable{
     private String codeutilisateur;
     private String nom;
     private String prenom;
     private String datedenaissance;
     private String situationMatrimonial;
     private String telephone;
     private String adresse;
     private String ville;
     private String pays;
     private String email;
     private Integer boitePostale;
     private String cin;
     private String login;
     private String password;
     private Etudiant etudiant;
     private Set<Message> messages = new HashSet<>(0);
     private Responsable responsable;
     private Administrateur administrateur;
     private Secretaire secretaire;
     private Comptable comptable;
     private Enseignant enseignant;
     private String sms,selection;

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }
     
// private static BeanFactory factory;
//	static{
//		ApplicationContext context = new ClassPathXmlApplicationContext(new String [ ] {"/WEB-INF/applicationContext.xml"});
//		factory = context;
//	}


    public UtilisateurBean() {
    }

	
    public UtilisateurBean(String codeutilisateur) {
        this.codeutilisateur = codeutilisateur;
    }
   
    public String getCodeutilisateur() {
        return this.codeutilisateur;
    }
    
    public void setCodeutilisateur(String codeutilisateur) {
        this.codeutilisateur = codeutilisateur;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getDatedenaissance() {
        return this.datedenaissance;
    }
    
    public void setDatedenaissance(String datedenaissance) {
        this.datedenaissance = datedenaissance;
    }
    public String getSituationMatrimonial() {
        return this.situationMatrimonial;
    }
    
    public void setSituationMatrimonial(String situationMatrimonial) {
        this.situationMatrimonial = situationMatrimonial;
    }
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getAdresse() {
        return this.adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getVille() {
        return this.ville;
    }
    
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getPays() {
        return this.pays;
    }
    
    public void setPays(String pays) {
        this.pays = pays;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getBoitePostale() {
        return this.boitePostale;
    }
    
    public void setBoitePostale(Integer boitePostale) {
        this.boitePostale = boitePostale;
    }
    public String getCin() {
        return this.cin;
    }
    
    public void setCin(String cin) {
        this.cin = cin;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Etudiant getEtudiant() {
        return this.etudiant;
    }
    
    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
    public Set<Message> getMessages() {
        return this.messages;
    }
    
    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }
    public Responsable getResponsable() {
        return this.responsable;
    }
    
    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }
    public Administrateur getAdministrateur() {
        return this.administrateur;
    }
    
    public void setAdministrateur(Administrateur administrateur) {
        this.administrateur = administrateur;
    }
    public Secretaire getSecretaire() {
        return this.secretaire;
    }
    
    public void setSecretaire(Secretaire secretaire) {
        this.secretaire = secretaire;
    }
    public Comptable getComptable() {
        return this.comptable;
    }
    
    public void setComptable(Comptable comptable) {
        this.comptable = comptable;
    }
    public Enseignant getEnseignant() {
        return this.enseignant;
    }
    
    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    
    public void ajouterUser(){
        UtilisateurDao userDao = new UtilisateurDao();
       // Utilisateur user = (Utilisateur)factory.getBean("utilisateur");
        Utilisateur user = new Utilisateur() ;
        user.setNom(nom);
        user.setPrenom(prenom);
        user.setDatedenaissance(datedenaissance);
        user.setSituationMatrimonial(situationMatrimonial);
        user.setTelephone(telephone);
        user.setAdresse(adresse);
        user.setVille(ville);
        user.setPays(pays);
        user.setEmail(email);
        user.setBoitePostale(boitePostale);
        user.setCin(cin);
        user.setLogin(login);
        user.setPassword(password);
        userDao.addUtilisateur(user);
        this.sms="Utilisateur ajouter avec succes";
        effacerAll();
    }
    
    public void modifierUsers() {
        UtilisateurDao userDao = new UtilisateurDao();
       // Utilisateur user=(Utilisateur)factory.getBean("utilisateur");
        Utilisateur user = new Utilisateur() ;
        user.setCodeutilisateur(codeutilisateur);
        user.setNom(nom);
        user.setPrenom(prenom);
        user.setDatedenaissance(datedenaissance);
        user.setSituationMatrimonial(situationMatrimonial);
        user.setTelephone(telephone);
        user.setAdresse(adresse);
        user.setVille(ville);
        user.setPays(pays);
        user.setEmail(email);
        user.setBoitePostale(boitePostale);
        user.setCin(cin);
        user.setLogin(login);
        user.setPassword(password);
        userDao.modifierUtilisateur(user);
        this.sms="Utilisateur modifier avec succes";
        effacerAll();
    }
    
     public void supprimerUsers() {
        UtilisateurDao userDao = new UtilisateurDao();
        userDao.supprimerUtilisateur(telephone);
        this.sms = "Utilisateur supprimer avec succes";
        effacerAll();
    }
     
    public List<Utilisateur> getAllUsers() {
        List<Utilisateur> users = new ArrayList<Utilisateur>();
        UtilisateurDao userDao = new UtilisateurDao();
        users = userDao.listeUsers();
        return users;
    }
    
    public void toutesLesInfos(){
        UtilisateurDao userDao = new UtilisateurDao();
        Utilisateur user = userDao.selectionUsers(selection);
        System.out.println(user.getPrenom());
        this.nom = user.getNom();
        this.prenom = user.getPrenom();
        this.datedenaissance = user.getDatedenaissance();
        this.situationMatrimonial = user.getSituationMatrimonial();
        this.telephone = user.getTelephone();
        this.adresse = user.getAdresse();
        this.ville = user.getVille();
        this.pays = user.getPays();
        this.email = user.getEmail();
        this.boitePostale = user.getBoitePostale();
        this.cin = user.getCin();
        this.login = user.getLogin();
        this.password = user.getPassword();
    }
    
    private void effacerAll() {
        this.nom = "";
        this.prenom = "";
        this.datedenaissance = "";
        this.situationMatrimonial = "";
        this.telephone = "";
        this.adresse = "";
        this.ville = "";
        this.pays = "";
        this.email = "";
        this.boitePostale = 0;
        this.cin = "";
        this.login = "";
        this.password = "";
    }
}
