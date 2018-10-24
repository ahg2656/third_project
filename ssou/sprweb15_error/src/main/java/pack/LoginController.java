package pack;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	private String formViewName = "loginform";
	
	@ModelAttribute("command")
	public LoginCommand formback() {
		//초기화 작업이 필요하다면 여기서 설정 (가장 먼저 수행되기 때문에)
		
		return new LoginCommand();
	}
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String form() {
		return formViewName;
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String submit(@Validated @ModelAttribute("command") LoginCommand loginCommand, BindingResult result) {
		if(result.hasErrors()) {
			return formViewName;
		}
		if(loginCommand.getUserid().equals("aa") && loginCommand.getPasswd().equals("11")) {
			//참고) 컨트롤러 내에서 에러 발생 시 출력 파일로 보기
			int a = 10 / 0;
			
			return "redirect:/list";	//목록보기
		} else {
			return formViewName;	//다시 입력화면
		}
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(new DataValidator());
	}
}
