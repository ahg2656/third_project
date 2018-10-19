package aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		String[] configs = new String[] {"initbean1.xml","initaop1.xml"};
		
		ApplicationContext context = new ClassPathXmlApplicationContext(configs);
		
		WriteInter writeInter = (WriteInter) context.getBean("writeInterImpl");
		writeInter.write();
		
		HelloInter helloInter = (HelloInter) context.getBean("helloInterImpl");
		helloInter.hello();
		helloInter.hi();
	}

}
