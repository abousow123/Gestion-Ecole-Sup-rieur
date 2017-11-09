package org.sid.dao ;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sid.entite.Ec;
import org.sid.util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class EcDao implements IEcDao{

    @Override
    public void addEc(Ec ec) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(ec);
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
    public void modifierEc(Ec ec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void supprimerEc(String codematiere) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
