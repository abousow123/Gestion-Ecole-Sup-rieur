package org.sid.dao ;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sid.entite.Etudiant;
import org.sid.entite.Paiement;
import org.sid.entite.Utilisateur;
import org.sid.util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class PaiementDao implements IPaiementDao{

    @Override
    public void addPaiement(Paiement paye) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(paye);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

    @Override
    public List<Paiement> listPaiements() {
         List<Paiement> paiements = new ArrayList<>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            paiements = session.createQuery("select * from Paiement").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return paiements;
    }

    @Override
    public double listEtudiantsClasse(String codeClasse,String codeFiliere,int m) {
        
        double montant = 0;
        
        for(int i=0;i<listPaiements().size();i++){
            if(listPaiements().get(i).getEtudiant().getClasse().getCodeclasse().equalsIgnoreCase(codeClasse)
                    &&listPaiements().get(i).getEtudiant().getFiliere().getCodefiliere().equalsIgnoreCase(codeFiliere)){
                montant+= listPaiements().get(i).getMontant() ;
            }
        }
        
        return  montant;
    }
    
    
    
    
    
        
        
        
    
    
    
    
    
    
    
        
        
    
    
    
    
    
    
        
        
        
    
    
    
    
    
    
    
}
