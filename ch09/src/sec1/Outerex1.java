package sec1;

public class Outerex1 {

	public static void main(String[] args) {
		Outer out = new Outer();
		//외부 클래스로부터 객체를 생성
		Outer.Inner1 in = out.new Inner1();
		//그 안에있는 (내부클래스) 로부터객체 생성
	}

}
