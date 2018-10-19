package anno3_resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
	public static void main(String[] args) {
		String[] metas = new String[] {"anno3.xml", "anno3_etc.xml"};
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext(metas);
		
		AbcProcess abcProcess = (AbcProcess) context.getBean("abcProcess");
		abcProcess.showData();
	}
}
