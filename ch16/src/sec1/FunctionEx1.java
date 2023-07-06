package sec1;
//람다식
//함수를 조금더 효율적으로 줄일수있는 방안


class MyFunction1 {
	void method1(){//매개변수의 반환(return)이 없는 함수(메소드)
		System.out.println("메소드1을 호출하였습니당");
	}
}
public class FunctionEx1 {

	public static void main(String[] args) {
		MyFunction1 fnc1 = new MyFunction1();
		fnc1.method1();

	}

}
