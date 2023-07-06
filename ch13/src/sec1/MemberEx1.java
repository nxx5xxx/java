package sec1;

public class MemberEx1 {

	public static void main(String[] args) {
		//자바8부터는 뒤에 타입 생략이가능
		//<>파라미터타입 두개를 했으면 선언시에도 두개
		//즉 , T와 E를 대신하여 다른 타입을 대입한다는거라고 보면됨
		Member<String , Integer> m1 = new Member<>();
		m1.setFirst("이름 : ");
		m1.setSecond(4567);
		Member<Integer , String> m2 = new Member<>();
		m2.setFirst(1234);
		m2.setSecond("배고픔");
		
		System.out.println(m1.getFirst()+m1.getSecond());
		System.out.println(m2.getFirst()+m2.getSecond());

	}

}
