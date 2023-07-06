package sec1;
class MyFunction2{
	int Method2(){//매개변수는 없고 반환(리턴)이 있는경우
		return 1004;
	}
}
public class FunctionEx2 {

	public static void main(String[] args) {
		MyFunction2 fnc2 = new MyFunction2();
		int a = fnc2.Method2();
		System.out.println("당신은"+a);
		System.out.println(fnc2.Method2());
		

	}

}
