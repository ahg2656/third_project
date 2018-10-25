package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.BuserInter;

@Controller
public class BuserController {
	@Autowired
	private BuserInter inter;
	
	@RequestMapping("buser")
	public ModelAndView process(@RequestParam("code") String code) {
		return new ModelAndView("info", "buser", inter.buser(code));
	}
}
