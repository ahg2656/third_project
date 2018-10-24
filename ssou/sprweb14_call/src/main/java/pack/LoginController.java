package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	private String formViewName = "loginform";
	
	@Autowired
	private LoginCommand loginCommand;
	
	@ModelAttribute("command")
	public LoginCommand formback() {
		return loginCommand;
	}
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String form() {
		return formViewName;
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String submit(LoginCommand loginCommand) {
		if(loginCommand.getUserid().equals("aa") && loginCommand.getPasswd().equals("11")) {
			return "redirect:/list";	//목록보기
		} else {
			return formViewName;	//다시 입력화면
		}
	}
}
