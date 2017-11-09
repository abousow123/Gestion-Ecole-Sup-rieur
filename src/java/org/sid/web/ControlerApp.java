package org.sid.web;

import org.sid.dao.IUeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControlerApp {

	@Autowired
	private IUeDao iUeDao ;
	
	@RequestMapping(value="/index")
	public String index(){
		return "Trans" ;
	}
	
	@RequestMapping(value="/add")
	public String add(@RequestParam(value="mot")String mc,Model model){
		model.addAttribute("mc", mc) ;
		//model.addAttribute("ue", iUeDao.addUe(ue)) ;
		return "Trans" ;
	}
	
	
}
