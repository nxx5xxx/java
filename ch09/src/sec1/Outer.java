package sec1;
//394p
public class Outer {
	class Inner1{	} //인스턴스 멤버 클래스
	Inner1 in1 = new Inner1(); //인스턴스 멤버 인스턴스
	Outer(){//아우터 생성자
		Inner1 in2 =new Inner1();
	}
	void method(){
		Inner1 in3=new Inner1();
	}
	
}
