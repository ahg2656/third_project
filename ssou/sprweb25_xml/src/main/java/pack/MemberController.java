package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
	@RequestMapping(value="member", method=RequestMethod.GET)
	public String formBack() {
		return "myform";
	}
	
	@RequestMapping(value="member", method=RequestMethod.POST)
	@ResponseBody
	public String submit(@RequestBody String formData) {
		//name=value1&age=value2
		System.out.println(formData);
		return formData;
	}
}
