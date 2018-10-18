package anno1_required;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("anno1.xml");
		
		Abc abc = context.getBean("abc", Abc.class);
		System.out.println(abc);
		
		//사용 가능한 메소드 (여기서 의미는 없음)
		context.registerShutdownHook();	//Servlet destory() 를 명시적으로 호출
		context.refresh();
		
		context.close();
	}
}
