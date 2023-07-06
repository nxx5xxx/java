package sec1;

public class Example9 {

	public static void main(String[] args) {
		//float : 단정도 실수
		float a = 1234.5678f;
		float b = -1234.5678f;
		float c = 0.0001234f;
		float d = -0.0001234f;
		float e = 0x12cf;
		float f = 'K';
		float g = 0b11011;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		System.out.println("f="+f);
		System.out.println("g="+g);
		System.out.println("float의 표현범위 : -" +Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		System.out.println("float의 바이트수 " + Float.BYTES +"byte");
	}

}
