package anno1_required;

import org.springframework.beans.factory.annotation.Required;

public class Abc {
	private int number;
	
	@Required	//반드시 수행해야함 (이것만으론 효과 없음) -> XML 에서 ~~
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "number : " + number;
	}
}
