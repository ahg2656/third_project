package pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pack2.OutfileInterImpl;

@Configuration
public class Config {
	@Bean(name="myInfo") //기본값!
	public MyInfo myInfo() {
		return new MyInfo();
	}
	
	@Bean(name="mImpl")
	public MessageImpl messageImpl() {
		MessageImpl messageImpl = new MessageImpl("유비", "조조", 2000, myInfo());
		messageImpl.setSpec("ADsP 자격증");
		messageImpl.setOutfileInter(outfileInterImpl());
		return messageImpl;
	}
	
	@Bean
	public OutfileInterImpl outfileInterImpl() {
		OutfileInterImpl impl = new OutfileInterImpl();
		impl.setFilePath("c:/work/jtbc.txt");
		return impl;
	}
}
