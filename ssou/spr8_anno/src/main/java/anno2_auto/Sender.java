package anno2_auto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component	//스스로 Singleton 으로 생성
@Scope("singleton")	//기본설정(생략 가능)
//@Scope("prototype")	//매번 생성
//@Component("sender") //기본값
//@Component("my1") //이름 설정 -> @Qualifier 로 호출 시 사용
public class Sender implements SenderInter{
	public void show() {
		System.out.println("Sender show() 수행");
	}
}
