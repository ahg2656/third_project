package pack.upload;

import org.springframework.web.multipart.MultipartFile;

public class UploadFile {	//File 업로드를 위한 DTO
	private MultipartFile file;
	
	public MultipartFile getFile() {
		return file;
	}
	
	public void setFile(MultipartFile file) {
		this.file = file;
	}
}
