package dao;
import sec5.Mix;
public class Mix2 extends Mix{ //sec5.Mix라는곳에 있는 부모로 부터 상속받음
	public int field2 = super.field2; //슈퍼로 접근
	//메소드를 쓰기위해
/*
	@Override
	public void method1() {
		super.method1();
	}
*/ //메소드1은 public값 이므로 오버라이드를 할 필요가 없다
	
	
	@Override //상속받아서 메소드를 다루게 하는것 
	protected void method2() {
		
		super.method2();
	}
	
}
