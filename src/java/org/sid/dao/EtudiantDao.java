package org.sid.dao ;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sid.entite.Classe;
import org.sid.entite.Etudiant;
import org.sid.util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class EtudiantDao implements IEtudiantDao{

    @Override
    public boolean addEtudiant(Etudiant etudiant) {
       Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(etudiant);
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
    public void modifierEtudiant(Etudiant etudiant) {
         Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(etudiant);
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

    
    public void supprimerEtudiant(String code) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Etudiant etu = (Etudiant) session.load(Etudiant.class, code);
            session.delete(etu);
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
    public List<Etudiant> listEtudiantsClasse(String classe) {
          List<Etudiant> etu = new ArrayList<>();
	        Transaction trns = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
                    Query q = session.createQuery("select * from etudiant where etudiant.codeclasse=:x") ;
                    q.setParameter("x",classe) ;
	            etu = q.list();
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	        return etu;
    }

   
}