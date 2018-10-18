package pack.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import pack.model.MoneyCalc;
import pack.model.MoneyInter;

public class MyProcess implements MyInter{
	private MoneyInter inter;
	private int re[];
	
	public MyProcess(MoneyInter inter) {
		//Constructor Injection
		this.inter = inter;
	}
	
	
	@Override
	public void inputMoney() {
		try {
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader breader = new BufferedReader(reader);
			
			System.out.print("금액 입력 : ");
			String data = breader.readLine();
			
			int mymoney = Integer.parseInt(data);
			
			re = inter.calcMoney(mymoney);
			
		} catch (Exception e) {
			System.out.println("inputMoney err : " + e);
		}
		
	}
	
	@Override
	public void showMoney() {
		StringBuffer sb = new StringBuffer();
		sb.append("만원 : " + re[0] + "\n");
		sb.append("천원 : " + re[1] + "\n");
		sb.append("백원 : " + re[2] + "\n");
		sb.append("십원 : " + re[3] + "\n");
		sb.append("일원 : " + re[4]);
		
		System.out.println(sb.toString());
	}
}
