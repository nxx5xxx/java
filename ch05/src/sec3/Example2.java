package sec3;

import java.util.Calendar;

public class Example2 {

	public static void main(String[] args) {
		Weekday today = null;
		Calendar cal = Calendar.getInstance(); //달력(calendar는 자바에서 기본으로제공)
		//new를 넣으면 getinstance를빼야함
		int week = cal.get(Calendar.DAY_OF_WEEK); //달력에서 요일번호 가져오기(1~7)
		
		switch(week){ //Weekday. * ; *=열거형 상수
			case 1:
				today = Weekday.SUNDAY; break;
			case 2:
				today = Weekday.MONDAY; break;
			case 3:
				today = Weekday.TUESDAY; break;
			case 4:
				today = Weekday.WEDNESDAY; break;
			case 5:
				today = Weekday.THURSDAY; break;
			case 6:
				today = Weekday.FRIDAY; break;
			case 7:
				today = Weekday.SATURDAY; break;
		}
		if(today == Weekday.FRIDAY){
			System.out.println("불금");
		}else{
			System.out.println("그냥 공부나 열심히");
		}
	}

}
