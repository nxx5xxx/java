package sec1;

public class Example1 {

	public static void main(String[] args) {
		
		int a = 1004;
		
		System.out.println("a="+a);
		// 변수명의 규칙 (=명명규칙)
		// 1. 영문 소문자로 시작한다.
		// 2. 두번째 글자부터는 영문, 숫자, $, _ 를 활용할 수 있다
		// ex) int a_123 , b$123
		// 관례 : 만약, 변수명이 여러 단어로 이루어져 있을 경우
		// ex) ivememberyujin ->ive_member_yujin 처럼 (언더스코어=스네이크 방식)
		// 변수가 무엇을 저장하고있는지 이해하기 쉽도록
		// ivememberyujin -> iveMemberYujin (카멜방식)
		// 3. 변수명 사이에는 공백을 넣을 수 없다.
		// 자바는 카멜방식 파이썬이나 C는 언더스코어방식을 많이 쓴다.
		// 예약어 (자바에서 이미 명령 문구로 사용하고자 하여 정해진 단어)
		// ex - int,float처럼 보라색 즉, int int=1; 은안됨
	}

}
