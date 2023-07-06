package sec1;

public class Example6 {

	public static void main(String[] args) {
		//int
		int a = 3456789;
		int b = 'K';
		int c = 1004;
		int d = -67;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("integer의 표현범위");
		//integer는 Int가 아닌 Integer를 풀네임으로 써야한다
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println("a의 메모리주소" +System.identityHashCode(a));
		
		
	}

}
