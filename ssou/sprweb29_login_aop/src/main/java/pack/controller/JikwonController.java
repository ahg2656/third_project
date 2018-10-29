package pack.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pack.model.JikwonDto;
import pack.model.JikwonInter;

@Controller
public class JikwonController {
	@Autowired
	@Qualifier("jikwonImpl")
	private JikwonInter inter;
	
	@RequestMapping("jikwoninfo")
	public ModelAndView getList(HttpServletRequest request, HttpServletResponse response) {	//주의) AOP 사용 시 반드시 인자로 추가해야함
		List<JikwonDto> list = inter.jikwonList();
		
		ModelAndView view = new ModelAndView();
		view.addObject("list", list);
		view.setViewName("jikwonlist");
		return view;
	}
	
}
