package anno4_etc;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {
	public static void main(String[] args) {
		AbstractXmlApplicationContext context =
				new ClassPathXmlApplicationContext("anno4.xml");
		
		OurProcess ourProcess = (OurProcess) context.getBean("our");
		ourProcess.showResult();
		
		context.close();
	}

}
