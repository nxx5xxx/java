package sec2;

public class Car {
	//private를 안하면 직접접근가능
	String company;
	String model;
	int cc;
	String fuel;
	int speed;
	

	//사용자 정의 메소드
	public void startUp(){
		System.out.println("시동을 켭니다.");
	}
	public void turnOff(){
		System.out.println("시동을 끄겠습니다.");
	}
	public int speedUp(){
		return ++speed;
	}
	public int speedDown(){
		return --speed;
	}
	
}
