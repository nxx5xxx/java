package sec2;
//클래스로부터 상속받을경우 : extends
//인터페이스로부터 상속받을경우 : implements
//단 인터페이스가 인터페이스로부터 상속받는 경우엔 extends
//클래스로부터 인터페이스가 상속받는경우는 불가 - 구현체를 추상체가 상속받을수는없다
//다중상속 : 여러인터페이스로부터 상속받은 인터페이스 - extends
public class Member implements User{

	@Override
	public String method1() {
	
		return "회원";
	}

	@Override
	public int method2() {
	
		return 2;
	}
	

}
