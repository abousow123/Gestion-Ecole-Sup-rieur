/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.dao;

import org.sid.entite.Comptable;

/**
 *
 * @author Lenovo
 */
public interface IComptableDao {
    public boolean addComptable(Comptable compta);
    public void modifierComptable(Comptable compta);
    public void supprimerComptable(String code);
}
