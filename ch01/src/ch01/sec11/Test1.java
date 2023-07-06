package ch01.sec11;

public class Test1 {

	public static void main(String[] args) {
		// 한줄각주
		/*
		 여러줄
		  각주
		 */
		//모든 문장의 끝은 명령 블록이 아닌 이상은 ;으로 끝난다
		//변수의 타입 변수명; --- 변수의 선언
		//변수명=값; --- 초기화
		//변수 타입 변수명=값; --- 변수의 선언과 초기화
		//변수 타입 변수명1, 변수명2, 변수명3; --- 여러변수의 선언 : 타입이 모두 같을경우
		//변수 타입 변수명1=값, 변수명2=값, 변수명3=값; --- 여러변수의 선언
		//모든 기본 타입 변수 ( 단일 기억장소 ) 는 반드시 처리 전에 초기화 해야한다.
		//"문자열"+숫자 = 문자열 , "a="+a는 a=이라는 문자열에 a라는 숫자를 더한다는 의미
		//(문자열:여러글자 문자:한글자)
		//""는 문자열 ''는 문자(=한글자)를 저장할때 쓰임
		//한 줄에 여러개의 처리문장을 입력 할 수 있으나, 각 각 문장마다 ; 로 끝나야 한다
		//한번 선언된 변수는 재선언이 될수없으나 값의 변경은 가능하다 (값변경 불가는 상수)
		//대입 연산자는 오른쪽부터 연산 이중 대입 연산은 가장 오른쪽부터 연산한다
			int a=20; 
			int b; // 정수형 타입으로 b라는 이름의 변수를 선언하다
			b=40; // b라는 이름을 가진 변수에 40을 대입(저장)하라
			int c=30;
			int d=a+b;
			int e=5,f=10;
			String g = "김우주";
			char h = 'h';
			float y; long z;
			int i=b=a;
			System.out.println("a="+a);
			System.out.println("a+b="+d);
			System.out.println("b="+b);
			System.out.println(-c);
			System.out.println(g);
			System.out.println(h);
			System.out.println(i);
			
			//변수타입(기본자료형) ()는 byte를 나타냄
			//숫자 : 정수, 실수
			//정수 : byte(1) , short(2) , int(4) , long(8)
			//실수 : float(4) , double(8) , 
			//문자 : 한개의문자 , 문자열 : 여러개의 문자
			//문자 : char(2), string( 거의무한대,가변문자열이라고 함,500개저장하면 500byte 10개하면 10byte )
			//논리 : bool(1)

	}

}
