package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HappyController {
	@RequestMapping(value="happy.do", method=RequestMethod.POST)
	public ModelAndView srmn() {
		ModelAndView modelAndView = new ModelAndView("list3");
		
		return modelAndView;
	}
}
