package org.sid.web;

import org.sid.dao.UeDao;
import org.sid.metier.EtudiantBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UeController {
	
	@Autowired
	UeDao ueDao ;
	
	@RequestMapping(value="/index")
	public String index(){
		return "Trans" ;
	}
	
	@RequestMapping(value="/Ue")
	public String addEtu(Model model){
		
		//model.addAttribute("toutUe",ueDao.getAllUe()) ;
		
		
		return "home" ;
	}

}
