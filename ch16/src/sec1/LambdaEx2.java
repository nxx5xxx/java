package sec1;

@FunctionalInterface
interface MyFnc2{//매개 변수는 없고,반환 (리턴)이 있는 람다식
	int fnc2();
}

public class LambdaEx2 {
	//생성자
	public LambdaEx2() {
		MyFnc2 f1 = () -> {
			return 1004;
		};
		
		System.out.println("결과1 "+f1.fnc2());
		
		MyFnc2 f2 = () -> {
			return 5959;
		};
		
		System.out.println("결과2"+f2.fnc2());
		
	}
	public static void main(String[] args) {
		new LambdaEx2(); //생성할때 호출함
		LambdaEx2 a = new LambdaEx2();
		System.out.println(a);

	}

}
/*
구현부는 별도 클래스를 만들거나 생성자로 할 수 있다.
		1.선언부
		@FunctionalInterface
		interface 인터페이스명{ //매개 변수와 반환 (리턴)이 없는 람다식
			void 메소드명();
		}
		
		2.구현부
		인터페이스명 객체명 = () -> { 실행내용; }
		객체명.메소드명();
		
----------------------------------------------------------------
		1.선언부
		
		@FunctionalInterface
		interface 인터페이스명{ //매개 변수는없고 반환 (리턴)이 있는 람다식
			반환타입(int,....) 메소드명();
		}
		
		2.구현부 
		인터페이스명 객체명 = () -> { return 반환값; }
		객체명.메소드명();

*/