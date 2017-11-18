package org.sid.dao ;

import java.util.List;
import org.sid.entite.Secretaire;

/**
 *
 * @author Lenovo
 */
public interface ISecretaireDao {
    public boolean addSecretaire(Secretaire secret);
    public void modifierSecretaire(Secretaire secret);
    public void supprimerSecretaire(String code);
     public List<Secretaire> listsSecretaire() ;
}
