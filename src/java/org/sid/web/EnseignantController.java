package org.sid.web;

import org.sid.metier.EnseignantBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnseignantController {
	
	@Autowired
	EnseignantBean enseignantBean ;
	
	@RequestMapping(value="/index")
	public String index(){
		return "index" ;
	}
	
	@RequestMapping(value="/enseignant")
	public String addEtu(Model model){
		
		//model.addAttribute("tout",enseignantBean.getAllUsers()) ;
                model.addAttribute("add") ;
                enseignantBean.ajouterUser();
		
		return "index" ;
	}


}
