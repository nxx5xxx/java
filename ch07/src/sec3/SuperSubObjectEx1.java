package sec3;
import sec2.*;
public class SuperSubObjectEx1 {

	public static void main(String[] args) {
		//객체 선언
		Customer cus;
		//객체 생성
		cus = new Customer();
		cus.setName("고양이");
		//함수 호출
		fnc1(cus);
		//cus는 Customer(부모 클래스이므로 자식타입의 매개객체로 받을수 없다)
		//fnc2(cus)
		
		//객체 형변환
		cus = new Member();
		cus.setName("강아지");
		fnc1(cus);
		//fnc2(cus); 불가
		
		//객체 형변환
		cus = new NonMember();
		cus.setName("기러기");
		fnc1(cus);
		//상속된 상황에서의 함수매개객체의 타입은 부모 타입의
		//매개객체로 설정해야 모두 받을 수 있다.
		//fnc3(cus); 불가
		Member cus2 = new Member();
		cus2.setName("도롱뇽");
		fnc2(cus2);
	} 	
		
		//메인함수 밖에서 만들어야함
		//함수 오버로딩
		public static void fnc1(Customer x){
			x.getCustom();
			System.out.println(x.getName());
	}
		//아래 설정을 안해도 부모타입의 매개객체설정때문에 쓸 수가 있다.
		public static void fnc2(Member x){
			x.getCustom();
			System.out.println(x.getName());
		}
		
		public static void fnc3(NonMember x){
			x.getCustom();
			System.out.println(x.getName());
		
	}

}


