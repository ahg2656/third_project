package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		System.out.println("TestController 수행");
		//return new ModelAndView("list");
		
		ModelAndView view = new ModelAndView();
		view.setViewName("list");
		view.addObject("say", "스프링 웹이여 영원하라!");
		return view;
	}
}
