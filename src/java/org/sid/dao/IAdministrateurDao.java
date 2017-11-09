/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.dao;

import org.sid.entite.Administrateur;

/**
 *
 * @author Lenovo
 */
public interface IAdministrateurDao {
    public boolean addAdministrateur(Administrateur admin);
    public void modifierAdmin(Administrateur admin);
    public void supprimerAdmin(String code);
}
