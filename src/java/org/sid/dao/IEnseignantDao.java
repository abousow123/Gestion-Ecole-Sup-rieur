package org.sid.dao ;

import java.util.List;

import org.sid.entite.Enseignant;
import org.sid.entite.Utilisateur;

/**
 *
 * @author Lenovo
 */
public interface IEnseignantDao {
    public boolean addEnseignant(Enseignant ens);
    public void modifierEnseignant(Enseignant ens);
    public void supprimerEnseignant(String code);
    public List<Utilisateur> listeUsers();
    public Utilisateur selectionUsersByCall(String telephone);
    public Utilisateur selectionUsers(String selection);
}
