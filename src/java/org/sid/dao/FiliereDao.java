package org.sid.dao ;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sid.entite.Enseignant;
import org.sid.entite.Etudiant;
import org.sid.entite.Filiere;
import org.sid.entite.Utilisateur;
import org.sid.util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class FiliereDao implements IFiliereDao {

    @Override
    public void addFiliere(Filiere fil) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(fil);
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
    public Filiere getFiliere(String code) {
           Filiere user = null ;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	             session.beginTransaction();
                     user = (Filiere)session.get(Filiere.class, code) ;
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
        
        
        return user ;
    }
    
}
