package pack;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Service	//없어도 됨
@Controller
public class SangpumController {
	/*@RequestMapping(value="sangpum", method=RequestMethod.POST)
	public ModelAndView abc(HttpServletRequest request) {
		String sang = request.getParameter("sang");
		String su = request.getParameter("su");
		String dan = request.getParameter("dan");
		System.out.println(sang + " " + su + " " + dan);
		ModelAndView view = new ModelAndView();
		view.setViewName("showMessage");
		view.addObject("message","good");
		
		return view;
	}*/
	
	@Autowired
	private SangpumModel sangpumModel;
	
	/*@RequestMapping(value="sangpum", method=RequestMethod.POST)
	public ModelAndView abc(SangpumBean bean) {
		ModelAndView view = new ModelAndView();
		view.setViewName("showMessage");
		view.addObject("message", sangpumModel.compute(bean));
		
		return view;
	}*/
	
	@RequestMapping(value="sangpum", method=RequestMethod.POST)
	public ModelAndView abc(@ModelAttribute("my") SangpumBean bean) {	//별명 부여 가능
		ModelAndView view = new ModelAndView();
		view.setViewName("showMessage");
		view.addObject("message", sangpumModel.compute(bean));
		
		return view;
	}
	
	@ModelAttribute("ourlist")	//request.setAttribute("ourlist", list) 와 같은 효과
	public List<String> aaa(){
		List<String> list = new ArrayList<String>();
		list.add("한국인");
		list.add("마당쇠");
		
		return list;
	}
}










