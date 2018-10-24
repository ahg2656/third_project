package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController{
	@RequestMapping("index.do")
	public ModelAndView abc() {
		System.out.println("TestController 수행");
		//return new ModelAndView("list");
		
		ModelAndView view = new ModelAndView();
		view.setViewName("list");
		view.addObject("say", "스프링 웹 어노테이션");	//request.getAttribute("say") 로 요청
		return view;
	}
}
