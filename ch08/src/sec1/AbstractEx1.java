package sec1;
public class AbstractEx1 {
	public static void main(String[] args) {
//		Abstract1 ab1 =new Abstract1();
//		메소드1에대한 자세한 내용이없어서 안됨
		Abstract1 ab1 =new Abstract1(){
			//추상화 클래스로부터 객체를 생성하기 위해 오버라이딩을 통해 기술
			
			@Override
			public String method1() {
				return "익명클래스의 메소드1";
			}
		};
		ab1.method1();
		method2(); //메소드를 호출하면 추상 클래스를 이용한 객체
	}
	
	static void method2(){
		Abstract1 ab1 = new Abstract1(){
			@Override
			public String method1() {
				return "메소드1";
			}
		};
		ab1.method1();
	}
	static void method3(Abstract1 ab1){ //익명의 클래스를 매개변수로 대입하기 위한 메소드
		ab1.method1();
	}
	//추상 클래스를 이용하여 객체를 생성하기 위해서는 추상 메소드에 대한 구현 내용을 기술

}
