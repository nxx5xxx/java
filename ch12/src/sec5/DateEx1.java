package sec5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("현재시각 : " +today);
		//DB에서는 날짜데이터 인데 , 처리하는 자바 구문의 필드는 날짜로 받아왔다
		//문자열(String)으로 변환하여야 원하는 날짜표식형식으로 변경할 수 있다.
		//SimpleDateFormat (클래스를 문자열의 특정 날자 표시 형식을 만들어 출력)
		//String d = today.toString(); //자바 11버전 이상에서는 날짜를 문자열로 변경
		SimpleDateFormat sf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); // 표시형식패턴설정
		String d = sf.format(today);
		System.out.println(d);
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		String e = sf2.format(today);
		System.out.println(e);
		

		/*Date 객체를 활용하여 자바 1.6이하에서는 년 월 일 시 분 초 별도로 분리할수 있는 명령어가 있었으나
		 * 1.8이상에서는 Calendar를 써야한다
		 *		System.out.println("년: " +today.getYear); 
		 * 		월 today.getMonth
		 * 		일 today.getDate
		 * 		시 Hour
		 * 		분 Minute
		 * 		초 Seconde
		 */
		
	}

}
