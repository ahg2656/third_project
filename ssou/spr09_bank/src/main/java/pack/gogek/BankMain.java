package pack.gogek;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.org.apache.bcel.internal.util.ClassPath;

public class BankMain {

	public static void main(String[] args) {
		AbstractXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("bankinit.xml");
		
		Gogek daniel = (Gogek) context.getBean("gogek");
		daniel.selBank("sin");
		daniel.playInputMoney(2000);
		daniel.playOutputMoney(1000);
		System.out.print("다니엘 - ");
		daniel.showMoney();
		
		System.out.println();
		
		Gogek john = (Gogek) context.getBean("gogek");
		john.selBank("sin");
		john.playInputMoney(2000);
		john.playOutputMoney(1000);
		System.out.print("존 - ");
		john.showMoney();
		
		context.close();
	}

}
