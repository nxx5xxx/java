package sec2;

public class InterfaceEx1 {

	public static void main(String[] args) {
//		User.play1(); //유저인터페이스에서 디폴트로 선언되어 있으므로 객체생성을 통해 호출
		User us; //선언
		//us = new User(); 추상체이므로 안됨
		us = new Member(); //재생성(형변환)
		us.play1();
		us = new Administrator();
		us.play1();
		
		User.play2(); //스태틱으로 선언되어 있으므로 인터페이스에서 직접 호출
		System.out.println(User.field1); 
		//인터페이스에서 선언된 필드는 final static(상수)이므로 객체생성을 하여 사용할 수도 있고,
		//인터페이스에서 직접 접근하여 사용할 수도 있다.
		
		Member us2; //선언
		us2 = new Member(); //초기화
		us.play1();
//		us.play2(); // 객체를 생성하지않고 유저인터페이스에서 직접호출해야함
		System.out.println(us.field1);
		
	}

}
