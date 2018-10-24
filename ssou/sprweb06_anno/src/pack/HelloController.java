package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("hello.do")	//get 과 post 를 구분하지 않음
	//@RequestMapping(value="hello.do", method=RequestMethod.GET)	//get 방식
	public ModelAndView kbs() {
		System.out.println("HelloController 처리");
		
		ModelAndView view = new ModelAndView();
		view.setViewName("list1");
		view.addObject("msg", "헬로우");
		
		return view;
	}
}
