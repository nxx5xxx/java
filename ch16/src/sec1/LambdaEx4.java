package sec1;
//함수적 인터페이스 -> 람다식

//매개변수도있고 , 반환(리턴)도 있는 람다식
//가장많이쓰임
//스프링구조에서는 ex2,3처럼 내부에 생성자를 만들어서 사용
public class LambdaEx4 {
	
	@FunctionalInterface
	public interface MyFnc4{
		int getCalc(int x, int y);
	}
	
	public static void main(String[] args) {
		MyFnc4 add = (a,b) -> {
			return a+b;
		};
		MyFnc4 minus = (a,b) -> {
			return a-b;
		};
		MyFnc4 multi = (a,b) -> {
			return a*b;
		};
		MyFnc4 div = (a,b) -> {
			return a/b;
		};
		
		System.out.println(add.getCalc(50, 60));
		System.out.println(minus.getCalc(80, 50));
		System.out.println(multi.getCalc(5, 4));
		System.out.println(div.getCalc(80, 40));
		

	}

}
