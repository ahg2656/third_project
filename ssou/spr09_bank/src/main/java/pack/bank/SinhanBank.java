package pack.bank;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component	//객체 생성- @Component("sinhanBank") 변경 가능
@Scope("prototype")
public class SinhanBank implements Bank{
	private int money = 5000;	//계좌 개설 시 초기금액
	
	@Override
	public void inputMoney(int money) {
		this.money += money;
	}
	
	@Override
	public void outputMoney(int money) {
		this.money -= money;
	}
	
	@Override
	public int getMoney() {
		return money;
	}
}
