package pack.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("list2")
public class JsonMultiController {
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public Map getJsons() {	//Map<k,v> <> 생략시 두 값 모두 Object 타입
		List<Map<String, String>> dataList = new ArrayList<Map<String,String>>();
		
		Map<String, String> data = new HashMap<String, String>();
			
		data.put("name", "한국인");
		data.put("age", "20");
		dataList.add(data);
		
		data = new HashMap<String, String>();
		
		data.put("name", "한사람");
		data.put("age", "22");
		dataList.add(data);
		
		data = new HashMap<String, String>();
		
		data.put("name", "두사람");
		data.put("age", "24");
		dataList.add(data);
		
		Map<String, Object> data2 = new HashMap<String, Object>();
		data2.put("datas", dataList);
		//여러 dataList 를 넣어도 가능
		return data2;
	}
}
