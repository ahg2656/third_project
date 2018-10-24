package pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		System.out.println("HelloController Ã³¸®");
		
		ModelAndView view = new ModelAndView();
		view.setViewName("list1");
		view.addObject("msg", "Çï·Î¿ì");
		
		return view;
	}
}
