package advice;

import org.aopalliance.intercept.Invocation;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//주의!! MethodInterceptor -> org.aopalliance.intercept.MethodInterceptor;
public class TestAdvice implements MethodInterceptor{
	//MethodInterceptor 는 Around advice 를 지원
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		//target 메소드 수행 전에 하고 싶은 작업
		String methodName = invocation.getMethod().getName();
		System.out.println(methodName + " 전에 관심사항 수행");
		
		//핵심로직
		Object object = invocation.proceed();	
		
		//target 메소드 수행 후에 하고 싶은 작업
		System.out.println(methodName + " 수행 후 뭔가를 처리");
		
		return object;
	}
}
