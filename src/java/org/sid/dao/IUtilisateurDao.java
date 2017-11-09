package org.sid.dao ;
import java.util.List;

import org.sid.entite.Utilisateur;

/**
 *
 * @author Lenovo
 */
public interface IUtilisateurDao {
    public boolean addUtilisateur(Utilisateur user);
    public void modifierUtilisateur(Utilisateur user);
    public void supprimerUtilisateur(String code);
    public List<Utilisateur> listeUsers();
    public Utilisateur selectionUsersByCall(String telephone);
    public Utilisateur selectionUsers(String selection);
}
