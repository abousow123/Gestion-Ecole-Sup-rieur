package org.sid.dao ;

import org.sid.entite.Responsable;

/**
 *
 * @author Lenovo
 */
public interface IResponsableDao {
    public boolean addResponsable(Responsable res);
    public void modifierResponsable(Responsable res);
    public void supprimerResponsable(String code);
}
