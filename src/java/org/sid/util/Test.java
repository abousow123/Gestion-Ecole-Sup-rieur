package org.sid.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.sid.dao.AdministrateurDao;
import org.sid.dao.ClasseDao;
import org.sid.dao.EnseignantDao;
import org.sid.dao.EtudiantDao;
import org.sid.dao.FiliereDao;
import org.sid.dao.NiveauDao;
import org.sid.dao.SecretaireDao;
import org.sid.dao.UeDao;
import org.sid.dao.UtilisateurDao;
import org.sid.entite.Administrateur;
import org.sid.entite.Classe;
import org.sid.entite.Etudiant;
import org.sid.entite.Filiere;
import org.sid.entite.Niveau;
import org.sid.entite.Semestre;
import org.sid.entite.Ue;
import org.sid.entite.Utilisateur;
import org.sid.metier.AdministrateurBean;
import org.sid.metier.ClasseBean;
import org.sid.metier.EtudiantBean;
import org.sid.metier.PaiementBean;
import vues.ImagesView;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HibernateUtil.getSessionFactory() ;
//                
//                Date d = new Date() ;
//                System.out.println(d.toString());

//                 PaiementBean bean = new PaiementBean("201719sa39", "40000","2");
//                 bean.ajoutPaiment();
             
             EtudiantBean eb = new EtudiantBean() ;
             ArrayList<Utilisateur> al = eb.lep() ;
             for(int i=0;i<al.size();i++){
                 System.out.println(al.get(i).getNom());
             }
 
                
//                AdministrateurDao ad = new AdministrateurDao() ;
//
		        //  EnseignantDao dao = new EnseignantDao();
                          
//
		//Utilisateur utilisateur = new Utilisateur("sow", "abou","marier", "775822453", "fdfg", "fgj", "bvbf", "dfdf", "dfd","dfd", "gfdf");
               // EtudiantBean etudiantBean = new EtudiantBean("Sow", "Omar", "12/01/2001", "dakar", "785325", "sds", "sdc", "Licence 1", "f1");
                
              //  etudiantBean.ajouterUser();
                
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
            
         // EtudiantDao dap = new EtudiantDao();
        /*   EtudiantBean dao = new EtudiantBean();
           
            FiliereDao fd = new FiliereDao() ;
            Filiere f =  fd.getFiliere("f1") ;
            
            ClasseDao cd = new ClasseDao();
            Classe c = cd.getClasse("Licence 1");
           
            dao.setCodeClasse(c.getCodeclasse());
            dao.setF(f.getCodefiliere());
            
           ArrayList<Etudiant>  es =  (ArrayList<Etudiant>) dao.AllEtudiantClasse() ;
           
           for(int i = 0;i<es.size();i++){
               System.out.println(es.get(i).getUtilisateur().getNom()+" "+es.get(i).getUtilisateur().getPrenom());
           }*/
           
           //dao.ajouterUser();
            
           // EtudiantDao dao1 = new EtudiantDao() ;
           // Etudiant e = new Etudiant() ;
           // e.setCodeutilisateur("900010136AD");
           
          
            
          //  dao.ajouterUser();
         
         // dao1.supprimerEtudiant("3001") ;
            
//            SecretaireDao dao = new SecretaireDao() ;
//            for(int i=0;i<dao.listsSecretaire().size();i++){
//                System.out.println(dao.listsSecretaire().get(i).getUtilisateur().getNom());
//            }
//
           SecretaireDao dao = new SecretaireDao() ;
//             
//             System.out.println(dao.listsSecretaire().get(0).getUtilisateur().getNom()+" "+
//             dao.listsSecretaire().get(0).getUtilisateur().getPrenom());
             
//             String login = "GueyeFatou@ucad.com";
//             String codeutilisateur = "800070811SE" ;
//             
//            for(int i=0;i<dao.listsSecretaire().size();i++){
//                if(login.equalsIgnoreCase(dao.listsSecretaire().get(i).getUtilisateur().getLogin()) &&
//                        codeutilisateur.equalsIgnoreCase(dao.listsSecretaire().get(i).getCodeutilisateur())){
//                    
//                    System.out.println("Abou--------------------");
//                    
//                }
//               
//            }


            
          
          //ClasseBean bean =new ClasseBean("M1", "dfdf", 25, "df") ;
         // bean.ajoutClasse();
            

	}

}
