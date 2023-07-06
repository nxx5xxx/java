package sec1;

public class Example4 {

	public static void main(String[] args) {
		//byte
		byte a = 127;
		byte b = 0;
		byte c = -128;
		byte d =0b110101; // = 53
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		//레퍼런스 타입 -열거형
		System.out.println("byte : "+Byte.BYTES);
		//바이트의 입력가능범위 보기
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		
		System.out.println("short : "+Short.BYTES);
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println(Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		//메모리 주소
		System.out.println("a 메모리주소 : "+ System.identityHashCode(a)  );
		System.out.println("b 메모리주소 : "+ System.identityHashCode(b));
	}

}
