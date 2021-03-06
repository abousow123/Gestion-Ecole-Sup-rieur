package org.sid.dao ;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sid.entite.Classe;
import org.sid.entite.Enseignant;
import org.sid.entite.Etudiant;
import org.sid.entite.Utilisateur;
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
    public void modifierEtudiant(Utilisateur ens,Etudiant et,String code) {
         Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
             UtilisateurDao ud = new UtilisateurDao() ;
            ud.modifierUtilisateur(ens, code);
            Etudiant e = (Etudiant) session.get(Enseignant.class, code) ;
            e.setClasse(et.getClasse());
            
            session.update(e);
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
            Utilisateur etu = (Utilisateur) session.load(Utilisateur.class, code);
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
    public List<Etudiant> listEtudiantsClasse(String classe,String f) {
          List<Etudiant> etu = new ArrayList<>();
	        Transaction trns = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
                    Query q = session.createQuery("select m from Etudiant m where m.classe.codeclasse=:x and m.filiere.codefiliere=:y") ;
                    q.setParameter("x",classe) ;
                    q.setParameter("y",f) ;
	            etu = q.list();
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	        return etu;
    }

    @Override
    public Utilisateur getEtudiant(String code) {
           Utilisateur user = null ;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	             session.beginTransaction();
                     user = (Utilisateur)session.get(Utilisateur.class, code) ;
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
        
        
        return user ;
    }
    
     @Override
    public Etudiant getEtudiantE(String code) {
           Etudiant user = null ;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	             session.beginTransaction();
                     user = (Etudiant)session.get(Etudiant.class, code) ;
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
        
        
        return user ;
    }

   
}