package sec5;

public class MathEx1 {

	public static void main(String[] args) {
		//Math : static 클래스
		int a = 1004;
		float b = 3.14f;
		long c = 6553600;
		double d = 26500.3425d;
		
		int e = -1004;
		float f = 3.65f;
		long g = -6553600;
		double h = 26500.7425d;
		
		System.out.println("지수상수 : "+Math.E);
		System.out.println("파이상수 : "+Math.PI);
		System.out.println("절대값 : "+Math.abs(e)+", "+Math.abs(a));
		System.out.println("올림값 : "+Math.ceil(h));
		System.out.println("반올림값 : "+Math.round(b));
		System.out.println("내림값 : "+Math.floor(h));
		System.out.println("최대값 : "+Math.max(a, e));
		System.out.println("최소값 : "+Math.min(a, e));
		System.out.println("랜덤값 (0< <1 : "+Math.random());
		
		System.out.println("제곱값 : "+Math.pow(a, 2));//a의 2제곱만큼
		System.out.println("제곱근 : "+Math.sqrt(a));//a의 제곱근 (루트a)
		System.out.println("사인 : "+Math.sin(30));
		System.out.println("코사인 : "+Math.cos(30));
		System.out.println("탄젠트 : "+Math.tan(30));
		
	}

}
