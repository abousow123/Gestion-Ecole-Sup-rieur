/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.dao;

import org.sid.entite.Domaine;

/**
 *
 * @author Lenovo
 */
public interface IDomaineDao {
    public void addDomaine(Domaine domaine);
    public void modifierDomaine(Domaine domaine);
    public void supprimerDomaine(String codedomaine);
}
