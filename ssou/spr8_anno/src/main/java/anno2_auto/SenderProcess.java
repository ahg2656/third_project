package anno2_auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service	//@Componet 도 가능하지만 서비스의 시작점을 알리기 위해 사용(가독성)
public class SenderProcess {
//	@Autowired	//settter 와 같은 역할 (내부적으로 setter 진행) -> XML 에서 <bean class="Autowired~"> or <context~> 생성
//	//타입에 의한 매핑!! (name X) -> 같은 타입의 객체가 두 개인 경우 에러
//	private Sender sender;
	
	@Autowired
	@Qualifier("sender2")
	private SenderInter senderInter;
	
//	public void setSender(Sender sender) {
//		this.sender = sender;
//	}
	
	public SenderInter getSender() {
		return senderInter;
	}
	
	public void displayData() {
		senderInter.show();
	}
}
