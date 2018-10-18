package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ArrangeMain {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("classpath:arrange.xml");
		//ApplicationContext context =	//경로 변경 가능 
		//				new ClassPathXmlApplicationContext("classpath:pack/arrange.xml");
		//context.close() : 불가능
		
		//버전업! 이것도 가능
		//GenericXmlApplicationContext context = 
		//		new GenericXmlApplicationContext("classpath:arrange.xml");
		
		//Annotation file 로 환경설정 시 
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		
		
		//Singleton 여부
		MessageImpl impl1 = (MessageImpl) context.getBean("mImpl");
		impl1.sayHi();
		MessageImpl impl2 = (MessageImpl) context.getBean("mImpl");
		impl2.sayHi();
		
		System.out.println(impl1.toString() + "\n" + impl2.toString());
		//주소가 같음 -> bean 의 기본값이 scope="singleton"
		
		System.out.println("\n------------------------------------\n");
		//다형성
		//MessageInter inter = (MessageImpl) context.getBean("mImpl");	//인터페이스의 파생클래스가 많은 경우 사용
		//MessageInter inter = (MessageInter) context.getBean("mImpl");
		//MessageInter inter = context.getBean("mImpl", MessageImpl.class);	//인자로 클래스 타입을 줌
		MessageInter inter = context.getBean("mImpl", MessageInter.class);
		inter.sayHi();
		
		
		context.close();	//이 클래스는 사용 가능
	}
}
