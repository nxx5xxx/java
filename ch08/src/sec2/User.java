package sec2;
//인터페이스 = 완전추상체
public interface User {
	public String field1 = "필드1";
	//인터페이스 안의 기본필드는 상수다(final static)
	public String method1(); //추상메소드
	public int method2();
	
	default void play1(){ //인터페이스 안에서 구현 메소드를 만들기 - 호출이 불가
		System.out.println("인터페이스 안에 구현메소드넣기");
	}
	static void play2(){
		System.out.println("호출 가능한 구현메소드");
	}

}
