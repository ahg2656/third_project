package controller.com.third_pro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Pby_Controller {
	
	
	@RequestMapping("main")
	public void returnMain() {
		System.out.println("aa");
	}
}
