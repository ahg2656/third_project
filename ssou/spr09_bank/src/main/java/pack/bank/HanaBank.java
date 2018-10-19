package pack.bank;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("hana")
@Scope("prototype")
public class HanaBank implements Bank{
	private int money = 1000;
	
	@Override
	public void inputMoney(int money) {
		if(money > 0) {				//차이를 주기 위한 것 (의미없음)
			this.money += money;
		}
	}
	
	@Override
	public void outputMoney(int money) {
		if(getMoney() >= money) {	//차이를 주기 위한 것 (의미없음)
			this.money -= money;
		}
	}
	
	@Override
	public int getMoney() {
		return money;
	}
}
