package pack.model;

public class TotalCalc implements TotalInter{
	@Override
	public int calcTotal(int[] input) {
		int re = 0;
		re = input[0] * input[1];
		
		return re;
	}
}
