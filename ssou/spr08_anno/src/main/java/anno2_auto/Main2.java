package anno2_auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		String[] metas = new String[] {"anno2.xml"};
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext(metas[0]);
		SenderProcess senderProcess = context.getBean("senderProcess", SenderProcess.class);
		
		senderProcess.displayData();
		senderProcess.getSender().show();	//getter 가 있기 때문에
	}

}
