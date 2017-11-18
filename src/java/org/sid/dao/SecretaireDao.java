package org.sid.dao ;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sid.entite.Enseignant;
import org.sid.entite.Secretaire;
import org.sid.util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class SecretaireDao implements ISecretaireDao{

    @Override
    public boolean addSecretaire(Secretaire secret) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(secret);
            session.getTransaction().commit();
            session.flush();
            session.close();
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
    public void modifierSecretaire(Secretaire secret) {
          Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(secret);
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
    public void supprimerSecretaire(String code) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Secretaire secret = (Secretaire) session.load(Secretaire.class, new String(code));
            session.delete(secret);
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
    public List<Secretaire> listsSecretaire() {
        List<Secretaire> users = new ArrayList<>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Query q = session.createQuery("select e from Secretaire e");
            users = q.list() ;
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return users;
    }
    
}
