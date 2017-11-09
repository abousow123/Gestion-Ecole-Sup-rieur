package org.sid.dao ;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sid.entite.EnseignantResponsable;
import org.sid.util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class EnseignantResponsableDao implements IEnseignantResponsableDao {

    @Override
    public void addEnseignantResponsable(EnseignantResponsable ensRes) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(ensRes);
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
    public void modifierEnseignantResponsable(EnseignantResponsable ensRes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimerEnseignantResponsable(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
