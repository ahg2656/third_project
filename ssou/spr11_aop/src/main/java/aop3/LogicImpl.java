package aop3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("logic")
public class LogicImpl implements LogicInter{
	@Autowired
	@Qualifier("articleDao")
	private ArticleInter inter;
	
	@Override
	public void selectdata_process() {
		System.out.println("selectdata_process() 수행");
		inter.selectAll();
	}
}
