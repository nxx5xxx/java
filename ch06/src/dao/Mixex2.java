package dao;

import sec5.Mix;

public class Mixex2 {

		public static void main(String[] args) { //<<---소속되지않아서 함수
			Mix mix1 = new Mix();
			//필드의 접근
			mix1.field1 = 1;
//			mix1.field2 = 2; //다른패키지 라서 프로텍트 접근불가 -- 다른클래스에서 상속을받아 super키워드를 써야함
//			mix1.field3 = 3; //다른 패키지라서 디폴트 접근가능
//			mix1.field4 = 4; //프리베이트는 게터와 세터가 아니면 접근이 불가
			
			//메소드의 호출
			mix1.method1();
//			mix1.method2(); //다른클래스에서 상속을 받은 후 오버라이드를 이용해 호출
//			mix1.method3(); //디폴트는 다른패키지에 있으면 상속을 받아도 접근이 불가하다
//			mix1.method4(); //프리베이트(정보은닉) - 게터와 세터로 연결하는것이 아니면 그냥 연결 불가
			
	//새로운클래스 Mix2를 만들어 상속을받아 super로 연결 후
			Mix2 mix2 = new Mix2();
			mix2.field2 = 2;
			
			mix2.method2();
			
		}

	}
