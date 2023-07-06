package sec1;

public class ExampleA {

	public static void main(String[] args) {
		//double : 배 정도 실수
		double a = 123.456; //d를 붙이지않으면 float으로 간주
		double b = 123.456d;
		double c = 'Q';
		double d = 0764.321; //8진수 float으로 대입
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("double의 표현범위: -" +Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		System.out.println("double의 바이트 수 : " + Double.BYTES +"Byte");
	}

}
