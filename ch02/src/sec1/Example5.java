package sec1;

public class Example5 {

	public static void main(String[] args) {
			short a = 1234; //프리미티브 타입 - 기본형
			short b = 4321;
			short c = -30000;
			short d = 32000;
			short e = -0;
			byte f =124;
			Short g = a; //레퍼런스타입 - 참조형
			Byte i = f;
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("c="+c);
			System.out.println("d="+d);
			System.out.println("e="+e);
			System.out.println("f="+f);
			//자료형이란 Data type을 의미함
			System.out.println("a 자료형 : "+ g.getClass().getName());
			System.out.println("f 자료형 " + i.getClass().getName());
			System.out.println(Short.MAX_VALUE+"~"+Short.MAX_VALUE);
			System.out.println("a의 메모리 주소" + System.identityHashCode(a));
			System.out.println("a의 자료형" + g.getClass().getName());
	}

}
