package sec2;

public class Car {
		private Tire tire1 = new Tire();
		
		
		
		private Tire tire2 = new Tire() { // 익명의 자식객체

			@Override
			public void roll() {
				System.out.println("이름이 없는 바퀴가 구른다");
			}
			
			
		}; //오버라이드 선언문이라 세미콜론이 붙는다
		
		public void run0(){
			
		}
		
		public void run1(){
			tire1.roll();
			tire2.roll(); //익명객체
		}
		
		public void run2(){ // 로컬 영역안에 익명객체
			Tire tire3 = new Tire(){ // 익명의로컬변수
				//Tire tire3가 없어도 가능해서 익명객체인데 sysout을 호출하기위해 어쩔수없이 이름을 준것
				//로컬객체 이므로 내부에서만 접근이 가능하다.

				@Override
				public void roll() {
					System.out.println("이름없는 익명 객체의 메소드 호출");
				}
				
			};
			tire3.roll(); //그래서 내부에서 호출
			
		}
		
//		public void run3(){
//			//tire3.roll(); //tire3가 run2메소드 안에있는 로컬인스턴스(지역객체)이기때문에 작동이 불가
//		}
		public void run3(Tire tire4){ //매개변수를 익명의 객체로 받아서 처리
		tire4.roll();
		}
}
