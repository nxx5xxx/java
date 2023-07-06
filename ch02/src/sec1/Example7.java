package sec1;

public class Example7 {

	public static void main(String[] args) {
		
		//long
		//l을 안 쓸 경우 integer로 취급해서 int의 표현범위 밖으로 쓸수 없다
		//long(8byte) int(4byte)
		long a = 123456789000L;
		long b = 365l;
		long c = 'z'; //소문자z
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
		System.out.println("long의 타입크기 : " + Long.BYTES +"Byte");
		System.out.println("long타입의 표현 범위");
		System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		
		System.out.println("a의 메모리주소"+System.identityHashCode(a));
		System.out.println("b의 메모리주소"+System.identityHashCode(b));
		
	}

}
