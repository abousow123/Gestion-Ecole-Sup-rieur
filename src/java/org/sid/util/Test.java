package org.sid.util;

import org.sid.dao.AdministrateurDao;
import org.sid.dao.EnseignantDao;
import org.sid.dao.EtudiantDao;
import org.sid.dao.NiveauDao;
import org.sid.dao.UeDao;
import org.sid.dao.UtilisateurDao;
import org.sid.entite.Administrateur;
import org.sid.entite.Etudiant;
import org.sid.entite.Niveau;
import org.sid.entite.Semestre;
import org.sid.entite.Ue;
import org.sid.entite.Utilisateur;
import org.sid.metier.ClasseBean;
import org.sid.metier.EtudiantBean;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HibernateUtil.getSessionFactory() ;
                
//                AdministrateurDao ad = new AdministrateurDao() ;
//
		        //  EnseignantDao dao = new EnseignantDao();
                          
//
		//Utilisateur utilisateur = new Utilisateur("sow", "abou","marier", "775822453", "fdfg", "fgj", "bvbf", "dfdf", "dfd","dfd", "gfdf");
              //  EtudiantBean etudiantBean = new EtudiantBean("sow", "abou","marier", "775822453", "fdfg", "fgj", "bvbf", "dfdf", "dfd","dfd", "gfdf") ;
                
               // etudiantBean.ajouterUser();
                
//
//		ad.addAdministrateur(new Administrateur(utilisateur));

                  // dao.supprimerEnseignant("700045731EN");



//            NiveauDao ni = new NiveauDao() ;
//            Niveau n = new Niveau(5);
//            ni.addNiveau(n);

            
           UtilisateurDao dao = new UtilisateurDao() ;
            
           // EtudiantDao dao1 = new EtudiantDao() ;
           // Etudiant e = new Etudiant() ;
           // e.setCodeutilisateur("900010136AD");
            
            dao.supprimerUtilisateur("700045731EN");
            

	}

}
