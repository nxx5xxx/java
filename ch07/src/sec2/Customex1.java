package sec2;

public class Customex1 {

	public static void main(String[] args) {
		Customer c1 = new Customer("김고객");
		Customer m1 = new Member(); //선언과 생성 하나의줄로
		Customer nm1 = new NonMember();
		/*
		   	Customer c1;
			c1 = new Customer();
		*/ 
		
		/*
		    c1 = new Member(); //형변환(재생성)
		 */
		
		
		m1.setName("김회원");
		nm1.setName("김비회원");
		
		System.out.println(c1.getName());
		c1.getCustom(); //c1 ,m1 ,nm1은 객체 타입이라함
		System.out.println(m1.getName());
		m1.getCustom();
		System.out.println(nm1.getName());
		nm1.getCustom();
	}

}
