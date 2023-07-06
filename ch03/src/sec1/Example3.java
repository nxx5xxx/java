package sec1;

public class Example3 {

	public static void main(String[] args) {
		//부호 연산자 및 증감 연산자
		int a=30;
		int b=50;
		int c= a-b;
		c = -c; //부호연산자-
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		int sw = 1;
		System.out.println("\nsw="+sw);
		sw=sw*-1; //부호연산자 -1
		System.out.println("sw="+sw);
		sw=sw*-1;
		System.out.println("sw="+sw);
		int x=10;
		int y=10;
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println(++x); //전위연산
		System.out.println(--y); //전위연산
		System.out.println(x--);//후위연산
		System.out.println(y--);//후위연산
		System.out.println(x);
		System.out.println(y);
		System.out.println("y= "+(y++)); //후위연산
		System.out.println(y);
		

	}

}
