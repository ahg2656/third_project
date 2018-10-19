package aop1.aspect;

public class MyAspect {
	public void myLogin() {
		System.out.println("핵심 메소드 수행 전에 로그인 작업");
	}
	
	public void myLogout() {
		System.out.println("핵심 메소드 수행 후에 로그아웃 작업");
	}
	
	public void mySecurity() {
		System.out.println("핵심 메소드 수행 전에 보안 설정");
	}
	
}
