package aop1;

public class HelloInterImpl implements HelloInter{
	public HelloInterImpl() {
		System.out.println("HelloInterImpl 생성자");
	}
	
	@Override
	public void hello() {
		System.out.println("hello() 수행 완료");		
	}
	
	@Override
	public void hi() {
		System.out.println("hi() 수행 완료");		
	}
}
