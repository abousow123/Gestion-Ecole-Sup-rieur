package org.sid.dao ;


import java.util.List;
import org.sid.entite.Classe;
import org.sid.entite.Enseignant;
import org.sid.entite.Etudiant;
import org.sid.entite.Utilisateur;

/**
 *
 * @author Lenovo
 */
public interface IEtudiantDao {
    public boolean addEtudiant(Etudiant etudiant);
    public void modifierEtudiant(Utilisateur ens,Etudiant et, String code);
    //public void supprimerEtudiant(String code);
    public List<Etudiant> listEtudiantsClasse(String classe,String f) ;
    public Utilisateur  getEtudiant(String code) ;
    Etudiant getEtudiantE(String code) ;
    
}
