package sec1;

public class GenericEx1 {
//클래스와 인터페이스도 래퍼런스타입(참조)임
	public static void main(String[] args) {
		Generic<User> u1 = new Generic<>();
		//uname, uno, uid
		
//		u1.obj.setUno(123);
//		u1.obj.setUname("강아지");
//		u1.obj.setUid("Dog");
		//안에서 그에 해당하는 객체를 다시 만들어줘야함

		User uobj = new User();
		uobj.setUno(123);
		uobj.setUname("강아지");
		uobj.setUid("Dog");
		//그에 해당하는 객체에 대입을해줘야함
		u1.obj = uobj;
		System.out.println(u1.obj.toString());
		//toString은 클래스에서toString을 오버라이드 해줘야 주소출력이 아닌 값을 출력해준다
		
		
		Generic<Administrator> ad1 = new Generic<>();
		Administrator aobj = new Administrator();
		//grade, ano, name
		
		aobj.setAno(2);
		aobj.setGrade("2반");
		aobj.setName("주인장");
		
		ad1.obj = aobj;
		
		System.out.println(ad1.obj.toString());
		

	}

}
