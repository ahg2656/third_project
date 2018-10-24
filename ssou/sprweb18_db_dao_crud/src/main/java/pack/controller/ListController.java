package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pack.model.MemberDao;
import pack.model.MemberDto;

@Controller
public class ListController {
	private int pageSize = 3;	//각 페이지 출력 수
	
	@Autowired
	private MemberDao memberDao;
	
	@RequestMapping("list")	//~list?pageNum=1
	public ModelAndView listProcess(@RequestParam(value="pageNum", defaultValue="1") String pageNum) {
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage - 1) * pageSize;	//0,3,6,9... 
		int endRow = pageSize;
		int count = memberDao.getMemberCount();		//전체 멤버 수
		
		List<MemberDto> list = memberDao.getMemberList(startRow, endRow);
		
		ModelAndView view = new ModelAndView();
		view.setViewName("list");
		view.addObject("list", list);
		view.addObject("currentPage", currentPage);
		view.addObject("pageSize", pageSize);
		view.addObject("count", count);
		
		return view;
	}
}
