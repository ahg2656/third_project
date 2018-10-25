package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pack.model.BuserInter;
import pack.model.JikwonInter;

@Controller
public class ListController {
	@Autowired
	private JikwonInter jikwonInter;
	@Autowired
	private BuserInter buserInter;
 	
	
	@RequestMapping("list")
	public ModelAndView process() {
		ModelAndView view = new ModelAndView();
		view.setViewName("list");
		view.addObject("data", jikwonInter.list());
		view.addObject("buserlist", buserInter.buserList());
		return view;
	}
	
}
