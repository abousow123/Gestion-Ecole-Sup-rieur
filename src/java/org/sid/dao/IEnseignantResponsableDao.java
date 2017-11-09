package org.sid.dao ;

import org.sid.entite.EnseignantResponsable;

/**
 *
 * @author Lenovo
 */
public interface IEnseignantResponsableDao {
    public void addEnseignantResponsable(EnseignantResponsable ensRes);
    public void modifierEnseignantResponsable(EnseignantResponsable ensRes);
    public void supprimerEnseignantResponsable(String code);
}
