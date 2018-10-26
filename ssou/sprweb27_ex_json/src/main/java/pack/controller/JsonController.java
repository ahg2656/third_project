package pack.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pack.model.SangpumDaoInter;

@Controller
@RequestMapping("list")
public class JsonController {
	@Autowired
	private SangpumDaoInter inter; 
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public Map getJsons() {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("sangpum", inter.getDataAll());
		return data;
	}
	

}
