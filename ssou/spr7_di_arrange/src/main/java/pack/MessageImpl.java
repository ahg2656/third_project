package pack;

import pack2.OutfileInter;

public class MessageImpl implements MessageInter{
	//constructor 연습용
	private String name1, name2;	
	private int year;
	private MyInfo info;
	
	//setter 연습용
	private String spec;
	private OutfileInter outfileInter;
	
	//Dependency Injection 1
	public MessageImpl(String name1, String name2, int year, MyInfo info) {
		//constructor injection
		this.name1 = name1;
		this.name2 = name2;
		this.year = year;
		this.info = info;
	}
	//Dependency Injection 2
	public void setSpec(String spec) {
		//property injection
		this.spec = spec;
	}
	
	public void setOutfileInter(OutfileInter outfileInter) {
		this.outfileInter = outfileInter;
	}
	
	@Override
	public void sayHi() {	
		//출력 담당
		String msg = name1 + " " + name2 + "\n" + (year + 18) + "년";
		msg += "\n" + info.myData();
		msg += "\n" + spec;
		System.out.println(msg);
		
		//메세지를 파일로 출력
		outfileInter.outfileProcess(msg);
	}
}
