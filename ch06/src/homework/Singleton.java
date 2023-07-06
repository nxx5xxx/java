package homework;

public class Singleton {
	//정적 필드멤버선언과 초기화
	private static Singleton singleton=new Singleton();
	//생성자 선언
	private Singleton(){
	}
	//메소드 선언
	public static Singleton getInstance(){
		return singleton;
	}
}
