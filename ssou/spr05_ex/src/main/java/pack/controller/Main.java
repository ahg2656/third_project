package pack.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appInit.xml");
		
		MyInter inter = (MyInter) context.getBean("myprocess");
		
		inter.input();		
		inter.output();
	}

}
