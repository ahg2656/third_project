package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("world.do")
public class WordlController {
	@RequestMapping(method=RequestMethod.GET)	//get 规侥
	public ModelAndView sbs() {
		System.out.println("WorldController 贸府");
		
		ModelAndView view = new ModelAndView();
		view.setViewName("list2");
		view.addObject("msg", "岿靛:get");
		
		return view;
	}
	
	@RequestMapping(method=RequestMethod.POST)	//post 规侥
	public ModelAndView ytn() {
		System.out.println("WorldController 贸府");
		
		ModelAndView view = new ModelAndView();
		view.setViewName("list2");
		view.addObject("msg", "岿靛:post");
		
		return view;
	}
}
