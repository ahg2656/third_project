package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//기존 자바의 방법
		Message1 message1 = new Message1();
		message1.sayHello("홍길동");
		
		Message2 message2 = new Message2();
		message2.sayHello("홍두깨");
		
		MessageInter inter;
		inter = message1;
		inter.sayHello("관우");
		
		inter = message2;
		inter.sayHello("장비");
		
		System.out.println("-------아래는 스프링 사용---------------");
		ApplicationContext context = new ClassPathXmlApplicationContext("init.xml");
		MessageInter inter2 = (MessageInter)context.getBean("mes1");
		inter2.sayHello("손오공");
		inter2 = (MessageInter)context.getBean("mes2");
		inter2.sayHello("저팔계");
	}

}
