package pack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import pack.model.HelloModel;

public class HelloController implements Controller{
	private HelloModel helloModel;
	
	public void setHelloModel(HelloModel helloModel) {
		this.helloModel = helloModel;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		//ModelAndView view = new ModelAndView();
		
		//모델 수행
		String ss = helloModel.process();
		
		ModelAndView view = new ModelAndView();
		view.addObject("result", ss);
		
		view.setViewName("hello");	//위와 같음 (forward 방식)
		//view.setViewName("redirect:/views/hello.jsp");	//ViewReslover 를 거치지 않기 때문에 정확한 경로 필요(redirect 방식)
		
		
		return view;
	}
}
