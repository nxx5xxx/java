package sec3;
//함수와 객체전달 2
public class ObjectEx1 {
//매개변수 = 받는것 , 리턴 = 주는것
	
	/*
	 함수1();
	 함수2(매개변수타입에 해당하는 값 또는 변수);
	 리턴타입되는변수 = 함수3();
	 리턴타입되는변수 = 함수4(매개변수타입에 해당하는 값 또는 변수);
	 
	 
	 리턴타입 함수([매개변수타입 매개변수명]){
	 처리할문장;
	 }
	 
	 
	 void 함수1(){ 처리할 문장; }
	 void 함수2(매개변수타입 매개변수명){처리할문장;}
	 리턴타입 함수3(){ 처리할문장; return 리턴타입값 또는 리턴타입변수;}
	 리턴타입 함수4(매개변수타입 매개변수명){처리할문장; return 리턴타입값 또는 리턴타입변수;}
	 */
	public static void main(String[] args) {
		fnc0();
		
		Parent pr1 = new Parent();
		pr1.setLastName("고");
		pr1.setFirstName("라니");
		pr1.setAge(12);
		fnc1(pr1);
		
		System.out.println((pr1 instanceof Parent));
		
		Parent pr2 = fnc2();
		System.out.println(pr2.getLastName()+pr2.getFirstName()+pr2.getAge());
		
		
		Parent pt = new Parent();
		pt.setLastName("강");
		pt.setFirstName("아지");
		pt.setAge(3);
		Parent p3 = fnc3(pt);
		System.out.println(p3.getLastName()+p3.getFirstName()+p3.getAge());
	}
	
	//매개변수도없고 리턴값도 없는경우
	public static void fnc0(){
		System.out.println("fnc0을  호출");
	}
	
	//매개변수가 있고 리턴값이 없는경우
	public static void fnc1(Parent p){ 
		System.out.println(p.getLastName()+p.getFirstName()+p.getAge());
	}
	
	//매개변수가 없고 리턴값이 있는경우
	public static Parent fnc2(){
		Parent p = new Parent();
		p.setLastName("고");
		p.setFirstName("양이");
		p.setAge(10);
		return p;
	}
	
	//매개변수와 리턴값이 있는경우
	public static Parent fnc3(Parent p){
		Parent pr =new Parent();
		pr.setLastName(p.getLastName());
		pr.setFirstName(p.getFirstName());
		pr.setAge(p.getAge());
		return p;
	}

}
