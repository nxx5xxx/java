package sec1;

public class Child1 extends Abstract1{

	//추상화 되어있는것에 재정의를 하지않으면 에러가 난다
	//재정의 = 오버라이드 = 오버라이딩
	@Override
	public String method1() {
	//추상화 후 차일드에서받아 오버라이드함
		return "차일드1";
	}

	

}
