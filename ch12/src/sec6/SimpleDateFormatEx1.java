package sec6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx1 {

	public static void main(String[] args) {
/*		표시형식코드
 * 		y  : 년 (yyyy로안쓰고 yy만쓸경우 23만 표시됨)
 * 		M : 월 (3월기준으로 M도 한개만쓰면 03이아닌 3으로 표시)
 * 		d  : 일 (나머지도 마찬가지)
 * 		D : 월 구분이 없는 일 (1~365)
 * 		H : 24시패턴(0~23) 	k : 24시패턴이나 1~24
 * 		h : 12시패턴(1~12) 	K : 12시 패턴이나 0~11
 * 		m : 분
 * 		s : 초
 * 		S : 밀리세컨드(1/1000초)
 * 		E : 요일
 * 		a : 오전 / 오후
 * 		w : 금 년도의 몇 번째 주
 *		W : 해당 월의 몇번째 주
 * 
 * 		z : 해당 타임존(Locale) 형식으로 Long 타입으로 표시 (해당지역 + 시간)
 * 		Z : 해당 타임존(Locale) 형식으로 short 타입으로 표시 (시간만 나옴)
 * 		F : 이번 달 이번 주 몇 번째 날인지 표시
 *  
 */

		Date date = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy년 M월 dd일");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("오늘은 E요일 입니다");
		SimpleDateFormat sdf5 = new SimpleDateFormat("오늘은 올해의 D번째 날 입니다");
		SimpleDateFormat sdf6 = new SimpleDateFormat("오늘은 이달의 d번째 날 입니다");
		
		String d1 =  sdf1.format(date);  
		String d2 =  sdf2.format(date);  
		String d3 =  sdf3.format(date);  
		String d4 =  sdf4.format(date);  
		String d5 =  sdf5.format(date);  
		String d6 =  sdf6.format(date);  
		
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
		System.out.println(sdf4.format(date));
		System.out.println(sdf5.format(date));
		System.out.println(sdf6.format(date));
		
	}

}
