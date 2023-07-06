package sec1;
/*
	중첩클래스엔 3가지가있다
	인스턴스 멤버클래스 : 외부클래스인 A 클래스를 생성해야 B클래스를 생성할 수 있도록 한 클래스
	정적 멤버 클래스 : 외부클래스인 A 클래스를 생성하지 않고도 객체를 생성할수 있는 C클래스 
	로컬 클래스 : 외부클래스 A와 관계없이 멤버 메소드에 의해서 객체를 생성할 수 있는 D클래스
 */
public class A {
		//중첩클래스
	int field1;
	String filed2;
	class B{ //인스턴스 멤버클래스
		
	}
	
	static class C{ //정적 멤버 클래스
		
	}
	
	void method1(){
		
	}
	int method2(){
		int data=0;
		return data;
	}
	
	
	void method3(){
		class D{ //로컬클래스 : 메소드3안에서만 접목이 가능한 클래스
			
		}
	}
	
	
	private class E { //private이므로 외부클래스인 A안에서만 접근가능
		
	}
	
	public class F{ //public 이므로 외부 클래스의 객체 생성 후와 관계없이 접근이 가능함
		
	}
}
