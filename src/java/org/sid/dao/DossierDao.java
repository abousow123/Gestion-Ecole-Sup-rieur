package org.sid.dao ;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sid.entite.Dossier;
import org.sid.util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class DossierDao implements IDossierDao {

    @Override
    public void addDossier(Dossier dossier) {
      Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(dossier);
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
