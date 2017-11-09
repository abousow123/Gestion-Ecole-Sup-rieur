package org.sid.dao ;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sid.entite.Semestre;
import org.sid.util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class SemestreDao implements ISemestreDao{

    @Override
    public void addSemestre(Semestre sem) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(sem);
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
