package org.sid.dao ;

import org.sid.entite.Filiere;

/**
 *
 * @author Lenovo
 */
public interface IFiliereDao {
    public void addFiliere(Filiere fil);
     Filiere getFiliere(String code);
}
