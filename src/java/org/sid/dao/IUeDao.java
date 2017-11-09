package org.sid.dao ;

import org.sid.entite.Ue;

/**
 *
 * @author Lenovo
 */
public interface IUeDao {
    public void addUe(Ue ue);
    public void modifierUe(Ue ue);
    public void supprimerUe(String codeue);
}
