package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	//params 속성 값에 의해 요청을 구분
	@RequestMapping(value="kic/login", params="type=admin")
	public ModelAndView kbs() {
		ModelAndView view = new ModelAndView();
		view.setViewName("showMessage");
		view.addObject("message", "관리자로 로그인");
		
		return view;
	}
	
	@RequestMapping(value="kic/login", params="type=user")
	public ModelAndView mbc() {
		ModelAndView view = new ModelAndView();
		view.setViewName("showMessage");
		view.addObject("message", "일반고객으로 로그인");
		
		return view;
	}
	
	@RequestMapping(value="kic/login", params="!type")	//parameter 가 없는 경우
	public ModelAndView sbs() {
		ModelAndView view = new ModelAndView();
		view.setViewName("showMessage");
		view.addObject("message", "인자가 없어요!");
		
		return view;
	}
	
	@RequestMapping(value="kic/{aaa}")
	public ModelAndView ytn(@RequestParam("type") String type, @PathVariable String aaa) {
		//System.out.println(type + " " + aaa);
		ModelAndView view = new ModelAndView();
		view.setViewName("showMessage");
		view.addObject("message", "type : " + type + ", 요청 일부 : " + aaa);
		return view;
	}
	
	//http://localhost/sprweb13_params/ent/yg/singer/psy?title=챔피언
	@RequestMapping(value="/ent/{co}/singer/{singer}")
	public ModelAndView tvn(@RequestParam("title") String title, @PathVariable String co, @PathVariable String singer) {		
		String ss = "소속사 : " + co + "<br>소속가수 : " + singer + "<br>타이틀곡 : " + title;
		
		ModelAndView view = new ModelAndView();
		view.setViewName("showMessage");
		view.addObject("message", ss);
		return view;
	}
}
