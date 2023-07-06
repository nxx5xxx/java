package sec6;

import java.text.DecimalFormat;

//541p
public class DecimalFormtEx1 {

	public static void main(String[] args) {
		int a = 12345678;
		double b = 4321.12345678;
/*
 * 			""안에 쓸수있는것을 표시형식 코드라 한다
 * 			표시형식 코드 : 해당 데이터를 특정 형식으로 출력하기 위한 코드
 * 			0 : 10진수, 값이 없어도 무조건 자리를 채움
 *			# : 10진수 , 값이 없으면 표기하지않음
 *			. : 소수점
 *			- : 음수부호
 *			, :  해당 자리수에 찍힌,에따라 구분
 *			E : 지수형태로 표시
 *			% : 백분율 부호	
 *			이것외 기타문자
 *			;양수와 음수의 패턴을 모두 기술할경우 패턴 구분 ex) +#,### ; -#,###
 *			ex) "흑자 #,##0원 ; 적자 #,##0원" (양수일경우 왼쪽 음수일경우 오른쪽 출력함)
 *			
 */

		DecimalFormat f1 = new DecimalFormat("000000000.000000000");
		System.out.println(f1.format(b));
		DecimalFormat f2 = new DecimalFormat("#########.#########");
		System.out.println(f2.format(b));
		DecimalFormat f3 = new DecimalFormat("##,#0");
		DecimalFormat f4 = new DecimalFormat("\u00A4 \\ #,###.0"); //소수 첫째자리까지 표기
		//\u00A4는 \\와 같다
		DecimalFormat f5 = new DecimalFormat("#,###");
		int c = 1000000;
		
		String s3 = f3.format(b);
		System.out.println(s3);
		System.out.println(f3.format(a));
		System.out.println(f4.format(a));
		System.out.println(f5.format(c));
		

	}

}
