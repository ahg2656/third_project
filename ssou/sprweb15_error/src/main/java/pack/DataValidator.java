package pack;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class DataValidator implements Validator{
	public boolean supports(Class<?> arg0) {
		return LoginCommand.class.isAssignableFrom(arg0);
	}
	
	public void validate(Object target, Errors errors) {
		//target 에 대한 검증 지원, 에러 발생 시 Errors 객체에 저장
		LoginCommand command = (LoginCommand) target;
		
		System.out.println(command.getUserid() + " " + command.getPasswd());
		
		//검증 방법1.
		if(command.getUserid() == null || command.getUserid().trim().isEmpty()) {
			errors.rejectValue("userid", "err.userid"); //userid = <sform:errors path="userid" /> //err.userid in properties 
		}
		
		//검증 방법2.
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwd", "err.passwd");	//passwd = <sform:errors path="passwd" /> //err.passwd in properites
		
	}
}
