package org.sid.entite ;



/**
 * Message generated by hbm2java
 */
public class Message  implements java.io.Serializable {


     private String codemessage;
     private Utilisateur utilisateur;
     private String objet;
     private String contenue;
     private String destinataire;

    public Message() {
    }

	
    public Message(String codemessage, Utilisateur utilisateur) {
        this.codemessage = codemessage;
        this.utilisateur = utilisateur;
    }
    public Message(String codemessage, Utilisateur utilisateur, String objet, String contenue, String destinataire) {
       this.codemessage = codemessage;
       this.utilisateur = utilisateur;
       this.objet = objet;
       this.contenue = contenue;
       this.destinataire = destinataire;
    }
   
    public String getCodemessage() {
        return this.codemessage;
    }
    
    public void setCodemessage(String codemessage) {
        this.codemessage = codemessage;
    }
    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    }
    
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public String getObjet() {
        return this.objet;
    }
    
    public void setObjet(String objet) {
        this.objet = objet;
    }
    public String getContenue() {
        return this.contenue;
    }
    
    public void setContenue(String contenue) {
        this.contenue = contenue;
    }
    public String getDestinataire() {
        return this.destinataire;
    }
    
    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }




}


