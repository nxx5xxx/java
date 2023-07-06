package sec1;

public class MemberEx1 {

	public static void main(String[] args) {
			Member obj1 = new Member("mkk" , "3445");
			Member obj2 = new Member("kgb" , "1234");
			Member obj3 = new Member("bhu" , "9856");
			
			System.out.println("obj1 obj2같은 클래스로부터 만들어진 객체인가"+obj1.equals(obj2));
			System.out.println(obj1 instanceof Member);
		

	}

}
