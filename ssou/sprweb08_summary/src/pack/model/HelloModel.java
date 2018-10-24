package pack.model;

import java.util.Calendar;

public class HelloModel {
	public String process() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if(hour >= 6 && hour <= 10) {
			return "좋은 아침입니다."; 
		} else if(hour >= 12 && hour <= 15) {
			return "맛점하세요.";
		} else {
			return "안녕하세요.";
		}		
	}
}
