package org.sid.dao ;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sid.entite.Evaluer;
import org.sid.util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class EvaluerDao implements IEvaluerDao {

    @Override
    public void addEvaluer(Evaluer evaluer) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(evaluer);
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
