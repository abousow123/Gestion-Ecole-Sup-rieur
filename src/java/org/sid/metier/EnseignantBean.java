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
import org.sid.dao.EnseignantDao;
import org.sid.dao.UtilisateurDao;
import org.sid.entite.Cours;
import org.sid.entite.Enseignant;
import org.sid.entite.EnseignantResponsable;
import org.sid.entite.Utilisateur;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Lenovo
 */
@ManagedBean
@SessionScoped
public class EnseignantBean implements Serializable{
     private String codeutilisateur;
     private String nom;
     private String prenom;
     private String telephone;
     private String adresse;
     private String nationalite;
     private String email;
     private String login;
     private String password;
     private String sms,selection;
     private Utilisateur utilisateur;
     private String grade;
     private String status;
      private Set<Cours> courses = new HashSet<>(0);
     private EnseignantResponsable enseignantResponsable;

    public Set<Cours> getCourses() {
        return courses;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    
    
    public void setCourses(Set<Cours> courses) {
        this.courses = courses;
    }

    public EnseignantBean(String nom, String prenom, String telephone, String adresse, String nationalite, String email, String login, String password, String grade, String status) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = adresse;
        this.nationalite = nationalite;
        this.email = email;
        this.login = login;
        this.password = password;
        this.grade = grade;
        this.status = status;
    }
    
    

    public EnseignantResponsable getEnseignantResponsable() {
        return enseignantResponsable;
    }

    public void setEnseignantResponsable(EnseignantResponsable enseignantResponsable) {
        this.enseignantResponsable = enseignantResponsable;
    }
     
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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

     
      public EnseignantBean() {
    }

    public EnseignantBean(String codeutilisateur) {
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
    
    public void ajouterUser(){
        UtilisateurDao userDao = new UtilisateurDao();
        EnseignantDao ensDao= new EnseignantDao();
       // Utilisateur user=(Utilisateur)factory.getBean("utilisateur");
        Utilisateur user= new Utilisateur() ;
        user.setCodeutilisateur("700");
        user.setNom(nom);
        user.setPrenom(prenom);
        user.setNationalite(nationalite);
     
        user.setTelephone(telephone);
        user.setAdresse(adresse);
        
       
        user.setEmail(email);
        
        user.setLogin(nom+prenom+"@ucad.com");
        
        if(userDao.addUtilisateur(user)){
           // Enseignant ens=(Enseignant) factory.getBean("enseignant");
            
        	Enseignant ens= new Enseignant() ;
            ens.setCodeutilisateur(userDao.selectionUsersByCall(telephone).getCodeutilisateur());
            user.setCodeutilisateur(userDao.selectionUsersByCall(telephone).getCodeutilisateur());
            ens.setGrade(grade);
            ens.setStatus(status);
            ens.setUtilisateur(user);
            ensDao.addEnseignant(ens);
                    }
         effacerAll();
        
        this.sms= "Enseignant ajouter avec succes!";
       
    }
    
     public void modifierUsers(String code) {
        EnseignantDao userDao = new EnseignantDao();
        //Utilisateur user=(Utilisateur)factory.getBean("utilisateur");
        Utilisateur user= new Utilisateur() ;
       
       // user.setCodeutilisateur(codeutilisateur);
        user.setNom(nom);
        user.setPrenom(prenom);
        
       
        user.setTelephone(telephone);
        user.setAdresse(adresse);
       
        user.setEmail(email);
       
        user.setLogin(login);
        user.setPassword(password);
        
         Enseignant en = new Enseignant();
         en.setGrade(grade);
         en.setStatus(status);
        
        userDao.modifierEnseignant(user, en, code);
        this.sms="Enseignant modifier avec succes!";
        effacerAll();
    }
    
     public void supprimerUsers() {
        UtilisateurDao userDao = new UtilisateurDao();
        userDao.supprimerUtilisateur(codeutilisateur);
        this.sms = "Enseignant supprimer avec succes!";
        effacerAll();
    }
     
    public ArrayList<Enseignant> allUsers() {
        ArrayList<Enseignant> users = new ArrayList<>();
        EnseignantDao ed = new EnseignantDao();
        users = (ArrayList<Enseignant>) ed.listsEnseignant() ;
        return users;
    }
    
    public void toutesLesInfos(){
        UtilisateurDao userDao = new UtilisateurDao();
        Utilisateur user = userDao.selectionUsers(selection);
        System.out.println(user.getPrenom());
        this.nom = user.getNom();
        this.prenom = user.getPrenom();
        

        this.telephone = user.getTelephone();
        this.adresse = user.getAdresse();
      
        this.email = user.getEmail();
        
        this.login = user.getLogin();
        this.password = user.getPassword();
    }

    private void effacerAll() {
         this.nom = "";
        this.prenom = "";
    
        this.telephone = "";
        this.adresse = "";
      
        this.email = "";
      
        this.login = "";
        this.password = "";
    }
}
