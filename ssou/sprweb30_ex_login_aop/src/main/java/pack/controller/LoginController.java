package pack.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.GogekDto;
import pack.model.GogekInter;

@Controller
public class LoginController {
	@Autowired
	@Qualifier("gogekImpl")
	private GogekInter inter;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String loginGo() {
		return "login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String loginSubmit(HttpSession session, @RequestParam("name") String name, @RequestParam("jumin") String jumin) {
		GogekDto dto = inter.loginCheck(name);
		if(dto != null) {
			String realJumin = dto.getGogek_jumin();
			if(realJumin.equals(jumin)) {
				session.setAttribute("name", name);
			}
		}
		
		return "redirect:/jikwoninfo";
	}
	
	@RequestMapping("logout")
	public String getLogout(HttpSession session) {
		session.invalidate();
		return "redirect:/index.jsp";
	}
	
}
