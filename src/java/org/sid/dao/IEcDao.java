/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.dao;

import org.sid.entite.Ec;

/**
 *
 * @author Lenovo
 */
public interface IEcDao {
    public void addEc(Ec ec);
    public void modifierEc(Ec ec);
    public void supprimerEc(String codematiere);
}
