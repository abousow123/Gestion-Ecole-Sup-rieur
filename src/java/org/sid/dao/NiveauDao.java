
 package org.sid.dao ;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sid.entite.Niveau;
import org.sid.util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class NiveauDao implements INiveauDao {

    @Override
    public void addNiveau(Niveau niveau) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(niveau);
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
    
}
