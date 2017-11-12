package org.sid.util;

import java.util.ArrayList;
import java.util.List;
import org.sid.dao.AdministrateurDao;
import org.sid.dao.ClasseDao;
import org.sid.dao.EnseignantDao;
import org.sid.dao.EtudiantDao;
import org.sid.dao.NiveauDao;
import org.sid.dao.UeDao;
import org.sid.dao.UtilisateurDao;
import org.sid.entite.Administrateur;
import org.sid.entite.Classe;
import org.sid.entite.Etudiant;
import org.sid.entite.Niveau;
import org.sid.entite.Semestre;
import org.sid.entite.Ue;
import org.sid.entite.Utilisateur;
import org.sid.metier.AdministrateurBean;
import org.sid.metier.ClasseBean;
import org.sid.metier.EtudiantBean;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HibernateUtil.getSessionFactory() ;
                
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
// ClasseDao cd = new ClasseDao() ;

           // Classe c = cd.getClasse("sds12");
            
           // Classe  cs = new Classe("sbd2", "M1", 25, "type") ;
          //  ClasseDao classeDao = new ClasseDao() ;
           // classeDao.addClasse(cs) ;
            
          //  Classe c = classeDao.getClasse("sbd2") ;
           // c.setCodeclasse("dgf12");
           
          //  System.out.println(c.getCodeclasse());
            
           EtudiantBean dao = new EtudiantBean();
           ArrayList<Etudiant>  es = (ArrayList<Etudiant>) dao.AllEtudiantClasse("sbd2" );
           
           for(int i = 0;i<es.size();i++){
               System.out.println(es.get(i).getUtilisateur().getNom());
           }
           
           //dao.ajouterUser();
            
           // EtudiantDao dao1 = new EtudiantDao() ;
           // Etudiant e = new Etudiant() ;
           // e.setCodeutilisateur("900010136AD");
           
          
            
          //  dao.ajouterUser();
         
         // dao1.supprimerEtudiant("3001") ;
          //  System.out.println("hello: ");
            

	}

}
