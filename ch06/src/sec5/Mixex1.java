package sec5;
//Mixex1과 Mix는 같은 패키지에 존재함
public class Mixex1 {

	public static void main(String[] args) {
		Mix mix1 = new Mix();
		//필드의 접근
		mix1.field1 = 1;
		mix1.field2 = 2; //같은패키지 라서 프로텍트 접근가능
		mix1.field3 = 3; //같은패키지라서 디폴트 접근가능
//		mix1.field4 = 4; //프리베이트는 게터와 세터가 아니면 접근이 불가
		
		//메소드의 호출
		mix1.method1();
		mix1.method2();
		mix1.method3();
//		mix1.method4(); //프리베이트(정보은닉) - 메소드는 프리베이트로 걸면안됨(내부에서 쓰는것 말고는 못쓰기때문)
	}

}
