/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.dao;

import org.sid.entite.Classe;

/**
 *
 * @author Lenovo
 */
public interface IClasseDao {
     public boolean addClasse(Classe cla);
     public void modifierClasse(Classe cla);
     public void supprimerClasse(String codeclasse);
}
