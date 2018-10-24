package pack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController {
	@RequestMapping("list")
	public String process(Model model) {
		String msg = "로그인 성공으로 회원자료 읽기를 수행함";
		model.addAttribute("message", msg);
		
		return "showMessage";
	}
}
