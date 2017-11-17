package org.sid.dao ;

import java.util.List;
import org.sid.entite.Etudiant;
import org.sid.entite.Paiement;

/**
 *
 * @author Lenovo
 */
public interface IPaiementDao {
    public void addPaiement(Paiement paye);
    public List<Paiement> listPaiements() ;
    double listEtudiantsClasse(String codeClasse,String codeFiliere,int m) ;
    
}
