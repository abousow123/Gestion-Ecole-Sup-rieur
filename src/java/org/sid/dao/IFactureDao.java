package org.sid.dao ;

import org.sid.entite.Facture;
import org.sid.entite.Filiere;

/**
 *
 * @author Lenovo
 */
public interface IFactureDao {
    public void addFacture(Facture facture);
    public void modifierFacture(Facture facture);
    public void supprimerFacture(String codefacture);
   
}
