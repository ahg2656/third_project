package anno3_resource;

import javax.annotation.Resource;

public class AbcProcess {
	@Resource(name="abc1")	//이름에 의한 매핑
	private Abc1 abc1;
	private Abc2 abc2;
	
	@Resource(name="abc2")	//method 에도 가능
	public void aaa(Abc2 abc2) {
		this.abc2 = abc2;
	}
	
	public void showData() {
		String s1 = "이름은 " + abc1.getIrum();
		String s2 = "나이는 " + abc2.getNai();
		System.out.println(s1 + "\n" + s2);
	}
}
