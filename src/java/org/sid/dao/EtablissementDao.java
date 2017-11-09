package org.sid.dao ;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sid.entite.Etablissement;
import org.sid.util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class EtablissementDao implements IEtablissementDao {

    @Override
    public void addEtablissement(Etablissement etablissement) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(etablissement);
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
