package pack.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspectBean {
	@Autowired
	private SecurityClass class1;

	@Around("execution(public String processMsg()) or execution(* bu*(..))")
	public Object aopProcess(ProceedingJoinPoint joinPoint) throws Throwable {
		class1.mySecurity();

		Object object = joinPoint.proceed(); // 핵심메소드 수행을 위해 가져옴

		return object;	// null 을 반환하면 핵심메소드 수행하지 않음
	}
}
