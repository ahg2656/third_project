package pack.upload;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Service
public class FileValidator implements Validator{
	public boolean supports(Class<?> arg0) {
		return false;
	}
	
	public void validate(Object uploadFile, Errors errors) {
		UploadFile file = (UploadFile) uploadFile;
		
		if(file.getFile().getSize() == 0) {
			errors.rejectValue("file", "", "업로드할 파일을 선택하시오.");	
			//uploadform 의 <sform:errors path="file" cssStyle="color: red;" /> 에 출력
		} else {
			
		}
	}
}
