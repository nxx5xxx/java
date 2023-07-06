package sec1;

public class Example5 {

	public static void main(String[] args) {
		//논리 연산자 : && (And) , || (or) , ! (Not)
		//한개씩만 쓰면 비트연산자가 됨
		
		int a = 27;
		int b = 24;
		
		//AND논리 둘다 참이여야 결과가 참
		System.out.println("AND논리 둘다 참이여야 결과가 참");
		System.out.println("a>25 && b >25 : " +(a>25 && b>25) ); //틀림 - false
		System.out.println("a<25 && b >25 : " +(a<25 && b>25) ); //false
		System.out.println("a>25 && b <25 : " +(a>25 && b<25) ); // true

		System.out.println();
		//OR논리 하나만 참이나오면 결과는 참
		System.out.println("OR논리 둘중 하나만 참이나와도 결과는 참");
		System.out.println("a>25 || b >25 : " +(a>25 || b>25));
		System.out.println("a<25 || b >25 : " +(a<25 || b>25));
		
		System.out.println();
		//Not논리 참과 거짓을 반대로
		System.out.println("Not논리 참과 거짓을 반대로");
		boolean c = a>25 || b>25;
		System.out.println("c="+c );
		System.out.println("!c="+(!c) );
		System.out.println("!!c="+(!(!c)) );
		
		System.out.println();
		//XOR 베타적 논리 합 - 서로 값이 다를때만 참
		System.out.println("XOR 베타적 논리 합 - 서로 값이 다를때만 참");
		System.out.println("a<25 ^ b >25 : " +(a<25 ^ b>25) );
		System.out.println("a<25 ^ b <25 : " +(a<25 ^ b<25) );
		System.out.println("a>25 ^ b <25 : " +(a>25 ^ b<25) );
		System.out.println("a<25 ^ b <25 : " +(a>25 ^ b>25) );
	}

}
