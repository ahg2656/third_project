package controller.com.therd_pro;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping("main")
	public void returnMain() {
		System.out.println("aa");
	}
}
