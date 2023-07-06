package sec1;
//정적 멤버클래스
public class Surface {
	static class Inside {}
	
	//일반필드
	Inside field1 = new Inside();
	
	//정적필드
	public static Inside field2 = new Inside();
	
	//외부 클래스의 생성자함수
	Surface(){
		Inside in1 = new Inside();
	}
	
	//인스턴스 메소드 => 로컷 메소드
	void method1(){
		Inside in1 = new Inside();
		
	}
	//정적메소드의 로컬 클래스
	static void method2(){
		Inside in1 = new Inside();
	}
}
