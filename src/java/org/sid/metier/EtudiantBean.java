/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.metier ;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;
import org.sid.dao.ClasseDao;
import org.springframework.context.ApplicationContext;
import org.sid.dao.EtudiantDao;
import org.sid.dao.FiliereDao;
import org.sid.dao.UtilisateurDao;
import org.sid.entite.Classe;
import org.sid.entite.Etudiant;
import org.sid.entite.Filiere;
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
     private String nationalite;
     private String adresse;
     private String email;
     private Classe classe;
     private Utilisateur utilisateur;
     private String codeClasse ;
     private Filiere filiere;
     private String f ;
     private String sms;
    
    private Map<String,String> map  ;
    private Map<String,String> fili  ;

    
    
    public EtudiantBean(){
        map = new LinkedHashMap<>() ;
        fili = new LinkedHashMap<>() ;
        
        map.put("Licence 1", "Licence 1");
        map.put("Licence 2", "Licence 2");
        map.put("Licence 3", "Licence 3");
        map.put("Master 1", "Master 1");
        map.put("Master 2", "Master 2");
        
        fili.put("Informatique", "Informatique");
        fili.put("Genie Civil", "Genie Civil");
        fili.put("Management et gestion", "Management et gestion");
        
        
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    
    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Map<String, String> getFili() {
        return fili;
    }

    public void setFili(Map<String, String> fili) {
        this.fili = fili;
    }
    
    

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    
    
    public EtudiantDao getEtuDao() {
        return etuDao;
    }

    public void setEtuDao(EtudiantDao etuDao) {
        this.etuDao = etuDao;
    }
     
     
     
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

    public String getLieudenaissance() {
        return lieudenaissance;
    }

    public void setLieudenaissance(String lieudenaissance) {
        this.lieudenaissance = lieudenaissance;
    }

    public String getCodeClasse() {
        return codeClasse;
    }

    public void setCodeClasse(String codeClasse) {
        this.codeClasse = codeClasse;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
    
    
    
    

    public EtudiantBean(String nom, String prenom, String datedenaissance, String lieudenaissance, String telephone, String adresse, String email, String classe,String f) {
        this.nom = nom;
        this.prenom = prenom;
        this.datedenaissance = datedenaissance;
        this.lieudenaissance = lieudenaissance;
        this.telephone = telephone;
        this.adresse = adresse;
        this.email = email;
        this.codeClasse = classe;
        this.f = f ;
    }




    
    
    


     
// private static BeanFactory factory;
//	static{
//		ApplicationContext context = new ClassPathXmlApplicationContext(new String [ ] {"/WEB-INF/applicationContext.xml"});
//		factory = context;
//	}

    
    String context = ApplicationContext.FACTORY_BEAN_PREFIX ;

//    public EtudiantBean() {
//    }

	
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
        user.setCodeutilisateur("300");
        user.setNom(nom);
        user.setPrenom(prenom);
        user.setDatedenaissance(datedenaissance);
        user.setLieudenaissance(lieudenaissance);
        user.setTelephone(telephone);
        user.setAdresse(adresse);
        user.setNationalite(nationalite);
        user.setLogin(nom+prenom+"@ucad.com");
        user.setEmail(email);
        if(userDao.addUtilisateur(user)){
           // Etudiant etu=(Etudiant) factory.getBean("etudiant");
        	Etudiant etu = new Etudiant() ;
               // ClasseDao cd = new ClasseDao() ;
                 
            etu.setCodeutilisateur(userDao.selectionUsersByCall(telephone).getCodeutilisateur());
            user.setCodeutilisateur(userDao.selectionUsersByCall(telephone).getCodeutilisateur());
            ClasseDao cd = new ClasseDao() ;
            classe = cd.getClasse(codeClasse) ;
            etu.setClasse(classe);
            
            FiliereDao fd = new FiliereDao() ;
            filiere = fd.getFiliere(f) ;
            
            etu.setFiliere(filiere);
            etu.setUtilisateur(user);
           // System.out.println("org.sid.metier.EtudiantBean.ajouterUser()");
            etuDao.addEtudiant(etu);
        }
       // this.sms= "Etudiant ajouter avec succes!";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,prenom+" "+nom+ " ajouter avec succes!", "PrimeFaces Rocks."));
        effacerAll();
    }
    
    
     public ArrayList<Utilisateur> lep() {
        ArrayList<Utilisateur> users = new ArrayList<>();
        UtilisateurDao userDao = new UtilisateurDao();
        users = (ArrayList<Utilisateur>) userDao.listeUsers();
        return users;
    }
    
    public ArrayList<Etudiant> EtudiantClasse(){
        
        return (ArrayList<Etudiant>) etuDao.listEtudiantsClasse(codeClasse,f) ;
        
    }   
    
    public void reset(){
         ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
                    try {
                            ec.redirect("liste.xhtml");
                    } catch (IOException e) {
    // TODO Auto-generated catch block
                           e.printStackTrace();
                    }
    }
    
    public List<Utilisateur> all(){
        UtilisateurBean bean = new UtilisateurBean();
        return bean.getAllUsers() ;
    }
    
    public Utilisateur getEtudiant(){
        return etuDao.getEtudiant(codeutilisateur) ;
    }
    
    
    
    public void modifierEtudiant(){
    
         Utilisateur user= new Utilisateur() ;
       
       // user.setCodeutilisateur(codeutilisateur);
        user.setNom(nom);
        user.setPrenom(prenom);
        user.setDatedenaissance(datedenaissance);
        user.setLieudenaissance(lieudenaissance);
        user.setTelephone(telephone);
        user.setAdresse(adresse);
        user.setEmail(email);
       
        EtudiantDao ed = new EtudiantDao() ;
        Etudiant etudiant = ed.getEtudiantE(codeutilisateur)  ;
        etudiant.setClasse(classe);
       
       
        etuDao.modifierEtudiant(user,etudiant,codeutilisateur);
    }
//    public Etudiant oneEtudiant(String code){
//        etuDao.
//    }
    
    
    private void effacerAll() {
         this.nom = "";
        this.prenom = "";
        this.datedenaissance = "";
        this.lieudenaissance = "" ;
        this.telephone = "";
        this.adresse = "";
        this.nationalite = "";
        this.email = "";
        
    }
    
     public void supprimerEtudiant(){
         etuDao.supprimerEtudiant(codeutilisateur);
     }
    
    private void addChamp(){
        this.setNom(this.getNom());
        this.setPrenom(this.getPrenom());
        this.setAdresse(this.getAdresse());
    }
    
     public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("L'utilisateur modifié ","Numero: "+ ((Etudiant) event.getObject()).getCodeutilisateur());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        Etudiant etudiant = new Etudiant() ;
        etudiant.setUtilisateur(((Etudiant) event.getObject()).getUtilisateur());
        etudiant.setCodeutilisateur(etudiant.getUtilisateur().getCodeutilisateur());
        //etudiant.setResponsableclasse(((Etudiant) event.getObject()).getResponsableclasse());
        modifierEtudiant(); 
     
        supprimerEtudiant();

    }
     
       public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Modification annulle", "Numero: "+((Etudiant) event.getObject()).getCodeutilisateur());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
    }
    
}
