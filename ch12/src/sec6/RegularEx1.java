package sec6;

import java.util.regex.Pattern;

public class RegularEx1 {

	public static void main(String[] args) {
/*
 * 				정규표현식(Regular Expression)
 * 				정해져 있는 형식으로 구성되어있는지 True와 False로 검증
 * 				예를들어 이메일은 xyz@qwer.zxc 로 구성되는데 여기서 @와 . 은 빠지면안되는것
 * 				정규표현식	설명 ($는 끝을표시한다 생략해도 관계없음)
 * 				^[0-9]*$ 		숫자
 * 				^[a-zA-Z]*$ 	영문자
 * 				^[가-힣]*$ 	한글
 * 			
 * 
 */				
		
		
		String pattern = "^[0-9]*$"; //숫자만나오게
		String val = "123456789";
		
		boolean regex = Pattern.matches(pattern, val);
		System.out.println( regex);
		
		String name = "강아지";
		String tel = "010-5678-1234";
		String email="rkddkwl@naver.com";
		
		//유효성검사
		boolean name_check = Pattern.matches("^[가-힣]*$",name);
		System.out.println("이름 : "+name_check);
		boolean tel_check = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", tel);
		//(?:0|1|[6-9]) 는 0또는 1또는 6~9중 한개 (?:\\d{3}|\\d{4}) 는 개수가3개이거나 4개 \\d{4} 개수가 4개
		System.out.println("전화번호 :"+tel_check);
		boolean email_check = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+, input)?",email);
		//\\w는 한개의 알파벳 또는 한개의숫자 = [a-zA-Z_0-9]와 동일하다
		System.out.println("이메일 : "+email_check);
		
	}

}
