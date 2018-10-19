package aop3;

import java.util.Scanner;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAdvice {
	@Around("execution(public * aop3..*(..))")
	public Object kbs(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("핵심 메소드 전 작업");
		
		//로그인 작업
		Scanner sc = new Scanner(System.in);
		System.out.print("input id : ");
		String id = sc.nextLine();
		
		sc.close();
		
		if(!id.equals("aa")) {
			System.out.println("아이디 불일치! 작업을 종료합니다.");
			return null;
		}
		
		Object object = joinPoint.proceed();	//핵심 메소드
		
		System.out.println("핵심 메소드 후 작업");
		
		return object;
	}
}
