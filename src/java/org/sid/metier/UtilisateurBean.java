
package org.sid.metier;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.sid.dao.UtilisateurDao;
import org.sid.entite.Administrateur;
import org.sid.entite.Comptable;
import org.sid.entite.Enseignant;
import org.sid.entite.Etudiant;
import org.sid.entite.Message;
import org.sid.entite.Responsable;
import org.sid.entite.Secretaire;
import org.sid.entite.Utilisateur;
import org.springframework.context.ApplicationContext;
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
     private String lieudenaissance ;
     private String telephone;
     private String adresse;
     private String nationalite;
     
     private String email;
    
     private String login;
     private String password;
     private Etudiant etudiant;
     private Set<Message> messages = new HashSet<Message>(0);
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
     
//    private static BeanFactory factory;
//	static{
//		ApplicationContext context = new ClassPathXmlApplicationContext(new String [ ] {"/spring/springBeans.xml"});
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
   
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
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

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    

    public String getLieudenaissance() {
        return lieudenaissance;
    }

    public void setLieudenaissance(String lieudenaissance) {
        this.lieudenaissance = lieudenaissance;
    }
    
    
    
    

    
    public void ajouterUser(){
        UtilisateurDao userDao = new UtilisateurDao();
       // Utilisateur user = (Utilisateur)factory.getBean("utilisateur");
       Utilisateur user = new Utilisateur() ;
        user.setNom(nom);
        user.setPrenom(prenom);
        user.setDatedenaissance(datedenaissance);
        
        user.setTelephone(telephone);
        user.setAdresse(adresse);
        
        
        user.setEmail(email);
       
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
       
        user.setTelephone(telephone);
        user.setAdresse(adresse);
      
        user.setEmail(email);
      
        user.setLogin(login);
        user.setPassword(password);
//        userDao.modifierUtilisateur(user);
        this.sms="Utilisateur modifier avec succes";
        effacerAll();
    }
    
     public void supprimerUsers() {
        UtilisateurDao userDao = new UtilisateurDao();
        userDao.supprimerUtilisateur(codeutilisateur);
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
        
        this.telephone = user.getTelephone();
        this.adresse = user.getAdresse();
    
        this.email = user.getEmail();
        
        this.login = user.getLogin();
        this.password = user.getPassword();
    }
    
    private void effacerAll() {
        this.nom = "";
        this.prenom = "";
        this.datedenaissance = "";
       
        this.telephone = "";
        this.adresse = "";
        
        
        this.email = "";
        
       
        this.login = "";
        this.password = "";
    }
}
