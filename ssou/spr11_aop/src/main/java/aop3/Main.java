package aop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("initaop3.xml");
		
		LogicInter inter = (LogicInter) context.getBean("logic");
		inter.selectdata_process();
	}

}
