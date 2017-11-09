package org.sid.dao;

import org.sid.entite.Absence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Lenovo
 */
public interface IAbsenceDao {
    public void addAbsence(Absence abs);
    public void modifierAbsence(Absence abs);
    public void supprimerAbsence(String code);
}
