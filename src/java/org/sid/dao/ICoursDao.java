/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.dao;

import org.sid.entite.Cours;

/**
 *
 * @author Lenovo
 */
public interface ICoursDao {
    public void addCours(Cours cours);
    public void modifierCours(Cours cours);
    public void supprimerCours(String codecours);
}
