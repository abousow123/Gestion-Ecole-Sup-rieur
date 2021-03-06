
package org.sid.metier;


import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.swing.JOptionPane;
import org.primefaces.event.RowEditEvent;
import org.sid.dao.EnseignantDao;
import org.sid.dao.SecretaireDao;
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
     
     private Map<String,String> map  ;
    
     
     
     
     
    
     
     
     
     
     
    
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
     private String choix ;

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getChoix() {
        return choix;
    }

    public void setChoix(String choix) {
        this.choix = choix;
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
         map = new LinkedHashMap<>() ;
        
        
        map.put("Professeur", "Professeur");
        map.put("Secretaire", "Secretaire");
        map.put("Etudiant", "Etudiant");
       
        
      
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

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

   
    
    boolean verifProf(){
        
         EnseignantDao dao = new EnseignantDao() ;
            for(int i=0;i<dao.listsEnseignant().size();i++){
                if(login.equalsIgnoreCase(dao.listsEnseignant().get(i).getUtilisateur().getLogin()) &&
                        codeutilisateur.equalsIgnoreCase(dao.listsEnseignant().get(i).getCodeutilisateur())){
                    
                    return true;
                    
                    
                }
               
            }
        
        
        return  false ;
    }
    
     boolean verifSecr(){
        
        SecretaireDao dao = new SecretaireDao() ;
            for(int i=0;i<dao.listsSecretaire().size();i++){
                if(login.equalsIgnoreCase(dao.listsSecretaire().get(i).getUtilisateur().getLogin()) &&
                        codeutilisateur.equalsIgnoreCase(dao.listsSecretaire().get(i).getCodeutilisateur())){
                    
                    return true;
                    
                    
                }
               
            }
        
        
        return  false ;
    }
    
    
    
    public String authentification(){
        
        
        
        if(getChoix().equalsIgnoreCase("Professeur")){
            
                if(verifProf()){ 
                    ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
                    try {
                            ec.redirect("adminprof.xhtml");
                    } catch (IOException e) {
    // TODO Auto-generated catch block
                           e.printStackTrace();
                    }
                    //  return "adminprof.xhtml" ; 
                }
                    //return "adminprof.xhtml" ;      
            
        }
        
        if(getChoix().equalsIgnoreCase("Secretaire")){
            if(verifSecr()) {
                
                ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
                    try {
                            ec.redirect("Sgpage.xhtml");
                    } catch (IOException e) {
    // TODO Auto-generated catch block
                           e.printStackTrace();
                    }
                
            }
            
            
        }
        
       // JOptionPane jOptionPane ;
      //  jOptionPane.S
      
     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,prenom+" "+nom+ " Login ou Mot de passe incorrect", "PrimeFaces Rocks."));
  
        return "Layout1.xhtml" ;
    }
    
    
    
    
    public String gotoPageSg(){
        
        return "Sgpage.xhtml";
  
    }
    
    
    
    
    public static String gotoPageProf(){
        
   
        return "Layout.xhtml";
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
        List<Utilisateur> users = new ArrayList<>();
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
    
    
     public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("L'utilisateur modifié ","Numero: "+ ((Etudiant) event.getObject()).getCodeutilisateur());
        FacesContext.getCurrentInstance().addMessage(null, msg);
        Etudiant etudiant = new Etudiant() ;
        etudiant.setUtilisateur(((Etudiant) event.getObject()).getUtilisateur());
        etudiant.setCodeutilisateur(etudiant.getUtilisateur().getCodeutilisateur());
        etudiant.setResponsableclasse(((Etudiant) event.getObject()).getResponsableclasse());
        modifierUsers(); 
        

    }
     
       public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Modification annulle", "Numero: "+((Etudiant) event.getObject()).getCodeutilisateur());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
