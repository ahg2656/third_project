package anno4_etc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("our")
public class OurProcess {
	@Value("#{dataInfo.name}")	//외부 자료와 매핑 EL (getName() 접촉)
	private String name;
	private String part;
	private DataInfo dataInfo;
	
	public OurProcess() {
		
	}
	
	@Autowired	//생성자 두 곳 이상에 모두 쓰면 안됨 (기본 생성자 지정)
	public OurProcess(@Value("#{dataInfo.part}") String part) {
		this.part = part;
	}
	
	@Value("#{dataInfo.job}")	//public 이기 때문에 가능 (private 인 경우, getter 생성해야함)
	private String job;
	
	@PostConstruct	//생성자 생성 이전에 (초기화 작업) 수행하기 위한 곳 - 자바 제공
	public void hi() {	
		System.out.println("생성자 이후에 초기화 작업 수행");
	}
	@PreDestroy	//context.close() 수행 이후 작업 - 자바 제공
	public void bye() {
		System.out.println("마무리 작업 수행");
	}
	
	public void showResult() {
		System.out.println("name : " + name);
		System.out.println("part : " + part);
		System.out.println("job : " + job);
	}
}
