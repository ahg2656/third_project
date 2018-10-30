package pack.upload;

import org.springframework.web.multipart.MultipartFile;

public class UploadFile {	//File 업로드를 위한 DTO
	private MultipartFile file;		//여러 개의 파일 업로드 시 List<MultipartFile> 
	
	public MultipartFile getFile() {
		return file;
	}
	
	public void setFile(MultipartFile file) {
		this.file = file;
	}
}
