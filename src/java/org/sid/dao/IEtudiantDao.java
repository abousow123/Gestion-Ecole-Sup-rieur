package org.sid.dao ;


import java.util.List;
import org.sid.entite.Classe;
import org.sid.entite.Etudiant;
import org.sid.entite.Utilisateur;

/**
 *
 * @author Lenovo
 */
public interface IEtudiantDao {
    public boolean addEtudiant(Etudiant etudiant);
    public void modifierEtudiant(Etudiant etudiant);
    //public void supprimerEtudiant(String code);
    public List<Etudiant> listEtudiantsClasse(String classe) ;
    public Utilisateur  getEtudiant(String code) ;
    
}
