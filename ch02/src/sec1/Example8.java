package sec1;

public class Example8 {

	public static void main(String[] args) {
		//character : 문자
		char a = 'A';
		char b = 65;
		char c = '가';
		char d = 44032;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		//char는 문자함수이기때문에 int로 돌린후 나타내야한다
		int e = Character.MIN_VALUE; 
		int f = Character.MAX_VALUE;
		System.out.println("character의 바이트 크기 : -" + Character.BYTES +"byte");
		
		
		//character의 표현범위
		System.out.println("char의 표현범위 : "+e+"~"+f);
		
		
		
	}

}
