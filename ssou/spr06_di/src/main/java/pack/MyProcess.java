package pack;

public class MyProcess {	//Setter Injection
	private int nai;
	private String name;
	private ShowData showdata;
	
	public void setNai(int nai) {
		this.nai = nai;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setShowdata(ShowData showdata) {
		this.showdata = showdata;
	}
	
	@Override
	public String toString() {	//출력 담당	
		return "이름은 " + name + 
				", 나이는 " + nai + 
				", 별명은 " + showdata + 
				", 취미는 " + showdata.toHobby();
	}
	
	
}
