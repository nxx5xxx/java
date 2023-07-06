package sec1;
//람다식은 694p

//람다식(Lambda Expression) : 함수를 인터페이스화 하여 여러명령들을 짧은 표현식으로 구성한것.
//람다식의 기본은 추상체인 인터페잇스이며, 그 멤버들은 메소드(함수)만을 정의하여 사용한다. =>함수적 인터페이스
//즉, 람다식은 함수적 인터페이스로 정의 한 후 그 구체적인 내용은 구현하는 곳에서 정하여 사용할 수 있게 한다.
//FunctionalInterface를 넣어야 함수적 인터페이스로 인식한다

//익명 구현객체(추상체) 를 람다식으로 표현하려면 단 하나으 추상 메소드만 가져야함.


@FunctionalInterface //컴파일 과정에서 추상메소드가 한개인지 검사해줌 , 필수로 넣을필요는 없음. 
interface Myfnc1{//매개변수와 반환이없는 람다식
	void fnc1();
}

class Person {
	public void action(Myfnc1 f1){
		f1.fnc1();
	}
}


public class LambdaEx1 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.action(() -> {
			System.out.println("람다액션");
		});
		p1.action(() -> {
			System.out.println("람다액션2");
		});
	}

}
/*
=
void method() {System.out.println("야호");}

인터페이스 : void method1();
구현체 : mthod1(() -> { System.out.println("야호") });



*/