package pack.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import pack.model.TotalInter;

public class MyProcess implements MyInter{
	private TotalInter inter;
	private String[] re;
	
	public MyProcess(TotalInter inter) {
		this.inter = inter;
	}
	
	@Override
	public void input() {
		re = new String[2];
		try {
			InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader breader = new BufferedReader(reader);
			
			System.out.print("상품명 : ");
			re[0] = breader.readLine();
			System.out.print("수량 : ");
			
			int[] imsi = new int[2];			
			imsi[0] = Integer.parseInt(breader.readLine());
			System.out.print("단가 : ");
			imsi[1] = Integer.parseInt(breader.readLine());
			
			re[1] = Integer.toString(inter.calcTotal(imsi));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Override
	public void output() {
		StringBuffer sb = new StringBuffer();
		sb.append(re[0] + "상품의 금액은 " + re[1] + " 원입니다.");
		
		System.out.println(sb.toString());
		
	}
}
