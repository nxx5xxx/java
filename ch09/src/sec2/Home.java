package sec2;

public class Home {
	
	
	//필드에 익명 구현객체 대입방법
	//인터페이스는 추상체 이기때문에 불러왔으면(호출) 안에 들어가는내용을
	//반드시 적어줘야한다 (구체화,오버라이딩)
	private RemoteControl rc =new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켠다");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끈다");
			
		}
	};
	//필드를 이용하는 메소드
	public void use1(){
		rc.turnOn();
		rc.turnOff();
	}
	
	
	//로컬변수를 이용하는 메소드
	public void use2(){
		RemoteControl rc = new RemoteControl() {
			//로컬 변수에 익명구현 객체 대입
			@Override
			public void turnOn() {
				System.out.println("에어컨을 킨다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끈다");
				
			}
		};
		rc.turnOn();
		rc.turnOff();
		
	}
	//매개변수를 이용하는 메소드 
	//매개변수로 실행할 부분에서 인터페이스의 구현내용을 받아서 실행
	public void use3(RemoteControl rc){
		rc.turnOn();
		rc.turnOff();
	}
	
}
