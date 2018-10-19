package pack.gogek;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import pack.bank.Bank;
import pack.bank.HanaBank;
import pack.bank.SinhanBank;

@Service	//서비스의 시작점!!
@ComponentScan("pack.bank")		//xml 에서 pack.gogek 스캔 후 pack.bank 스캔
@Scope("prototype")
public class Gogek {
	private Bank bank;
	
	@Autowired(required = true)	//SinhanBank 타입이 없으면 에러
	private SinhanBank sinhanBank;
	
	@Resource(name="hana")
	private HanaBank hanaBank;
	
	public void selBank(String sel) {
		if(sel.equals("sin")) {
			bank = sinhanBank;
		} else if(sel.equals("ha")) {
			bank = hanaBank;
		}
	}
	
	public void playInputMoney(int money) {
		bank.inputMoney(money);
	}
	
	public void playOutputMoney(int money) {
		bank.outputMoney(money);
	}
	
	private String msg;
	@PostConstruct
	public void init() {
		msg = "계좌 잔고 : ";
	}
	@PreDestroy
	public void end() {
		System.out.println("프로그램 종료 시 마무리 처리");
		if(sinhanBank != null) sinhanBank = null;
		if(hanaBank != null) hanaBank = null;
	}
	
	public void showMoney() {
		//System.out.println("계좌 잔고 : " + bank.getMoney());
		System.out.println(msg + bank.getMoney());
	}
}
