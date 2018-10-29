package pack.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.JikwonInter;

@Controller
public class JikwonController {
	@Autowired
	@Qualifier("jikwonImpl")
	private JikwonInter inter;
	
	@RequestMapping("jikwoninfo")
	public ModelAndView info(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("jikwoninfo", "jikwon", inter.getInfo((String)session.getAttribute("name")));
	}
}
