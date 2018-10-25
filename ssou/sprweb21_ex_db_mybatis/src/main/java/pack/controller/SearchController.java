package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.BuserInter;
import pack.model.JikwonInter;

@Controller
public class SearchController {
	@Autowired
	private JikwonInter inter;
	@Autowired
	private BuserInter buserInter;
	
	@RequestMapping("search")
	public ModelAndView process(@RequestParam("buser") String code) {
		ModelAndView view = new ModelAndView();
		view.setViewName("list");
			
		if(code.equals("all")) {
			view.addObject("data", inter.list());			
		} else {
			view.addObject("buserlist", buserInter.buserList());
			view.addObject("data", inter.search(code));
			view.addObject("no", code);
		}		
		return view;
	}
	
}
