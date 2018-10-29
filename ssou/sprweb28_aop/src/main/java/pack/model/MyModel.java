package pack.model;

import org.springframework.stereotype.Repository;

@Repository
public class MyModel implements MyModelInter{
	public String processMsg() {
		System.out.println("processMsg Method 수행");
		return "Spring AOP good";
	}
	
	public String businessMsg() {
		System.out.println("businessMsg Method 수행");
		return "Spring AOP nice";
	}
}
