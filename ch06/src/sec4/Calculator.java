package sec4;

public class Calculator {
		static double pi = 3.141592;
		static int plus(int x,int y) {return x+y;}
		//plus라는 정적메소드 정수형 x와 y , x+y;로 반환
		
		static int minus(int x,int y){return x-y;}
		//minus라는 정적메소드 정수형 x와 y x-y로 반환
		
		static int multiple(int x, int y){return x*y;}
		//곱하기 정적메소드
		
		static float div(int x, int y){return (float)x/y;}
		// 나누기 정적메소드 실수형으로 반환
}
