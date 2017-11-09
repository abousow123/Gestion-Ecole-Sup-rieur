package org.sid.dao ;

import org.sid.entite.Facture;

/**
 *
 * @author Lenovo
 */
public interface IFactureDao {
    public void addFacture(Facture facture);
    public void modifierFacture(Facture facture);
    public void supprimerFacture(String codefacture);
}
