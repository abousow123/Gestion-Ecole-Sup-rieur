package org.sid.dao;

import org.sid.entite.EmploisDuTemps;

/**
 *
 * @author Lenovo
 */
public interface IEmploisDuTempsDao {
    public void addEmploisDuTemps(EmploisDuTemps empt);
    public void modifierEmploisDuTemps(EmploisDuTemps empt);
    public void supprimerEmploisDuTemps(String codeempt);
}
