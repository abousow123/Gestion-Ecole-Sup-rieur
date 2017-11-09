
 package org.sid.dao ;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sid.entite.Classe;
import org.sid.entite.Utilisateur;
import org.sid.util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class ClasseDao implements IClasseDao{

    @Override
    public boolean addClasse(Classe cla) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(cla);
            session.getTransaction().commit();
            session.flush();
            session.close();
            return true;
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
           
        }
        return false;
    }
    
    

    @Override
    public void modifierClasse(Classe cla) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimerClasse(String codeclasse) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public List<Classe> listeClasses() {
        List<Classe> classe = new ArrayList<>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            classe = session.createQuery("select * from Classe").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return classe;
    }
     
}
