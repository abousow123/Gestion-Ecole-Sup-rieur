package org.sid.web;

import org.sid.metier.EtudiantBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EtudiantController {
	
	@Autowired
	EtudiantBean etudiantBean ;
	
	@RequestMapping(value="/index")
	public String index(){
		return "Trans" ;
	}
	
	@RequestMapping(value="/etudiant")
	public String addEtu(Model model){
		
		model.addAttribute("tout") ;
		etudiantBean.ajouterUser();
		return "home" ;
	}

}
