package sec5;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTimeEx1 {

	public static void main(String[] args) {
		Date d1 = new Date();
		//Date d2 = new Date("2023-12-05");
		Calendar d3 = Calendar.getInstance();
		Calendar d4 = Calendar.getInstance();
		d4.set(2023, 11, 25); //월은 0부터시작
		LocalDateTime d5 = LocalDateTime.now();
		LocalDateTime d6 = LocalDateTime.of(2023, 12, 25, 16, 35, 10);
		System.out.println(d1);
		//System.out.println(d2);
		System.out.println(d3); //그레고리시 기준임
		System.out.println(d4);//날짜를바꾼값 출력
		System.out.println(d5);
		System.out.println(d6); //날짜를바꾼값
		

	}

}
