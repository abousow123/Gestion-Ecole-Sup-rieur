/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.metier ;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.context.ApplicationContext;
import org.sid.dao.EtudiantDao;
import org.sid.dao.UtilisateurDao;
import org.sid.entite.Classe;
import org.sid.entite.Etudiant;
import org.sid.entite.Utilisateur;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Lenovo
 */
@ManagedBean
@SessionScoped
public class EtudiantBean implements Serializable{
     private String codeutilisateur;
     private String nom;
     private String prenom;
     private String datedenaissance;
     private String lieudenaissance ;
     private String telephone;
     private String adresse;
     private String email;
     private Classe classe;
     private Utilisateur utilisateur;
     
     
      EtudiantDao etuDao= new EtudiantDao();

    

   

   



    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public EtudiantBean(String nom, String prenom, String datedenaissance, String lieudenaissance, String telephone, String adresse, String email, Classe classe) {
        this.nom = nom;
        this.prenom = prenom;
        this.datedenaissance = datedenaissance;
        this.lieudenaissance = lieudenaissance;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.classe = classe;
    }




    
    
    


     
// private static BeanFactory factory;
//	static{
//		ApplicationContext context = new ClassPathXmlApplicationContext(new String [ ] {"/WEB-INF/applicationContext.xml"});
//		factory = context;
//	}

    
    String context = ApplicationContext.FACTORY_BEAN_PREFIX ;

    public EtudiantBean() {
    }

	
    public EtudiantBean(String codeutilisateur) {
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

    

    
    public void ajouterUser(){
        UtilisateurDao userDao = new UtilisateurDao();
       // EtudiantDao etuDao= new EtudiantDao();
      //  Utilisateur user=(Utilisateur)factory.getBean("utilisateur");
        Utilisateur user = new Utilisateur() ;
        user.setCodeutilisateur("3007");
        user.setNom(nom);
        user.setPrenom(prenom);
        user.setDatedenaissance(datedenaissance);
        user.setLieudenaissance(lieudenaissance);
        user.setTelephone(telephone);
        user.setAdresse(adresse);
        user.setEmail(email);
        if(userDao.addUtilisateur(user)){
           // Etudiant etu=(Etudiant) factory.getBean("etudiant");
        	Etudiant etu = new Etudiant() ;
            etu.setCodeutilisateur(userDao.selectionUsersByCall(telephone).getCodeutilisateur());
            user.setCodeutilisateur(userDao.selectionUsersByCall(telephone).getCodeutilisateur());
            etu.setClasse(classe);
          
            etu.setUtilisateur(user);
            etuDao.addEtudiant(etu);
        }
      //  this.sms= "Etudiant ajouter avec succes!";
        effacerAll();
    }
    
    
    public List<Etudiant> AllEtudiantClasse(String classe){
        return etuDao.listEtudiantsClasse(classe) ;
    }   
    
    
    public void modifierEtudiant(){
    
        Etudiant etudiant = new Etudiant() ;
   
        
        etuDao.modifierEtudiant(etudiant);
    }
//    public Etudiant oneEtudiant(String code){
//        etuDao.
//    }
    
    
    private void effacerAll() {
         this.nom = "";
        this.prenom = "";
        this.datedenaissance = "";
  
        this.telephone = "";
        this.adresse = "";
      
        this.email = "";
        
    }
    
}
