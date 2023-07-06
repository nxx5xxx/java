package sec3;

public class Finalex1 {

	public static void main(String[] args) {
		Parent m1;
		m1 = new Parent();
		m1.getPrint();
		m1.outPut();
		
		m1 = new Child();
	//	m1.setJob(); -불가능
		m1.getPrint();
		m1.outPut(); //final을 걸었었었음
		
		
		/*	
		  	여기서 setJob이 불가능한 이유는
		  		Parent m1; 선언에서 갖고오는 값들은
				String lastName; 
				String firstName;
				int age;
				라서 setJob을 쓰려면 형변환(재생성) 이 아닌
				새로 Child m2로 생성해줘야 한다.
		 */	
		m1 = new Descendant();
		m1.getPrint();
		m1.outPut();
//		m1.setRoot(); 같은이유로 setRoot도 불가능
		
		Descendant m2 = new Descendant();
		m2.setRoot("김알지");
	}

}
