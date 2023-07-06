package sec5;

import java.util.Calendar;
//534p , 535p
public class CalendarEx1 {

	public static void main(String[] args) {
		
		/*Date 객체를 활용하여 자바 1.6이하에서는 년 월 일 시 분 초 별도로 분리할수 있는 명령어가 있었으나
		 * 1.8이상에서는 Calendar를 써야한다
		 *		System.out.println("년: " +today.getYear); 
		 * 		월 today.getMonth
		 * 		일 today.getDate
		 * 		시 Hour
		 * 		분 Minute
		 * 		초 Seconde
		 */
		
		//Calendar cal = new Calendar(); // 싱글톤이라 객체를 생성하지 못하고 메소드만 갖고와야함
		Calendar cal = Calendar.getInstance();
		
		int year = cal.YEAR;
		int month = cal.MONTH;
		int day_of_month = cal.DAY_OF_MONTH;
		int date = cal.DATE;
		int hour = cal.HOUR;
		int minute = cal.MINUTE;
		int second = cal.SECOND;
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		System.out.println();
		int year2 = cal.get(Calendar.YEAR);
		int year3 = cal.get(Calendar.DAY_OF_YEAR); //이번년도의 몇번째 날짜
		int month2 = cal.get(Calendar.MONTH);
		int date2 = cal.get(Calendar.DATE);
		int hour2 = cal.get(Calendar.HOUR);//12시간제
		int hour3 = cal.get(Calendar.HOUR_OF_DAY); //24시간제
		int minute2 = cal.get(Calendar.MINUTE);
		int second2 = cal.get(Calendar.SECOND);
		int lastdate = cal.getActualMaximum(Calendar.DATE);//이달의 마지막날짜
		
		int ampm = cal.get(Calendar.AM_PM);
		System.out.println(ampm);
		if(ampm == Calendar.AM){
			System.out.println("오전");
		}
		
		
		System.out.println(year2);
		System.out.println(month2+1); //1월은 0부터 시작해서 +1을 해줘야함
		System.out.println(date2);
		System.out.println(hour2);
		System.out.println(minute2);
		System.out.println(second2);
		System.out.println(lastdate);
		
		System.out.println();
		//요일번호
		int week = cal.get(Calendar.DAY_OF_WEEK); //일요일부터 1
		System.out.println(week);
		
		//사용방법예제
		switch(week){
			case Calendar.MONDAY: System.out.println("월요일"); break;
			case Calendar.TUESDAY: System.out.println("화요일"); break;
		}
	}

}
