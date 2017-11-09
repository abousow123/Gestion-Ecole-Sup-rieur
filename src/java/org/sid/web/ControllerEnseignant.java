/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.web;

import org.sid.metier.EnseignantBean;
import org.sid.metier.EtudiantBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sow-a
 */
@Controller
public class ControllerEnseignant {
    
    @Autowired
	EnseignantBean enseignantBean ;
        
	
	@RequestMapping(value="/index")
	public String index(){
		return "index" ;
	}
	
	@RequestMapping(value="/enseignant")
	public String addEtu(Model model){
		
		model.addAttribute("tout") ;
		enseignantBean.ajouterUser();
		return "index" ;
	}

    
    
}
