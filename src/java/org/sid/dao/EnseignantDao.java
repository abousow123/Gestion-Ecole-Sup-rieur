package org.sid.dao ;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sid.entite.Enseignant;
import org.sid.entite.Utilisateur;
import org.sid.util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class EnseignantDao implements IEnseignantDao {

    @Override
    public boolean addEnseignant(Enseignant ens) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(ens);
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
    public void modifierEnseignant(Enseignant ens) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(ens);
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
    public void supprimerEnseignant(String code) {
       Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Enseignant ens = (Enseignant) session.load(Enseignant.class, new String(code));
            session.delete(ens);
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
    public List<Utilisateur> listeUsers() {
        List<Utilisateur> users = new ArrayList<Utilisateur>();
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            users = session.createQuery("select * from Utilisateur").list();
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return users;
    }

    @Override
    public Utilisateur selectionUsersByCall(String telephone) {
        System.out.println(telephone);
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from Utilisateur where telephone= :id";
            Query query = session.createQuery(queryString);
            query.setString("id", telephone);
            Utilisateur cust = (Utilisateur) query.uniqueResult();
                return cust;
            
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return null;
    }

    @Override
    public Utilisateur selectionUsers(String selection) {
        System.out.println(selection);
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            String queryString = "from Utilisateur where concat(nom, ' ', prenom) = :id";
            Query query = session.createQuery(queryString);
            query.setString("id", selection);
            Utilisateur cust = (Utilisateur) query.uniqueResult();
                return cust;
            
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return null;
    }
    
}
