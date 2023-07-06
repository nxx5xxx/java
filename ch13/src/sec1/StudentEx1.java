package sec1;

public class StudentEx1 {
//제네릭은 아직 결정되지 않은 타입을 파라미터로 처리하고
//실제 사용 할 때 파라미터를 구체적인 타입으로 대체시키는 기능
	
//Generic(범용객체) : 하나의 타입만 사용하는것이 아니라 여러 타입 아무거나 모두 받아서
//저장하거나 처리할 수 있는 클래스나 인터페이스로 객체 생성시에 원하는 타입을 지정하여 활용
	
//클래스명<타입> 으로 선언되며,  타입은 다른 클래스이거나 열거형, 래퍼런스 타입이어야 한다.
	
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.field1 = "우아아";
		System.out.println(st1.field1);
		
		GenStudent st2 = new GenStudent();
		st2.field = "??";
		System.out.println(st2.field);
		
		GenStudent <String> st3 = new GenStudent<String>();
		st3.field = "스트링";
		GenStudent<Integer> st4 = new GenStudent<Integer>();
		st4.field = 1234;
		st2.field = 1234;
		

		System.out.println(st2.field);
		System.out.println(st3.field);
		System.out.println(st4.field);
	}

}
