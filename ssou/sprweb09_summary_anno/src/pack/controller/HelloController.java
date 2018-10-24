package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pack.model.HelloModel;

@Controller
//@RequestMapping("hello.do")
@RequestMapping({"world.do","h*,kbs/abc","mbc","sbs"})
public class HelloController{
	@Autowired
	private HelloModel helloModel;
	
	
	/*@RequestMapping(method=RequestMethod.GET)
	public ModelAndView abc() {
		//ModelAndView view = new ModelAndView();
		
		//모델 수행
		String ss = helloModel.process();
		
		ModelAndView view = new ModelAndView();
		view.addObject("result", ss);
		
		view.setViewName("hello");	//위와 같음 (forward 방식)
		//view.setViewName("redirect:/views/hello.jsp");	//ViewReslover 를 거치지 않기 때문에 정확한 경로 필요(redirect 방식)
		
		
		return view;
	}*/
	
	/*@RequestMapping(method=RequestMethod.GET)
	public Map<String, Object> abc() {
		String ss = helloModel.process();
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("result", ss);
		//요청명이 뷰파일명으로 고정
		
		return map;
	}*/
	
	@RequestMapping(method=RequestMethod.GET)
	public Model abc(Model model) {
		String ss = helloModel.process();
		model.addAttribute("result", ss);
		//요청명이 뷰파일명으로 고정
	
		return model;
	}
}
