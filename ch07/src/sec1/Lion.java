package sec1;
//Mammal의 모든멤버를 상속받음 =>extends
//상속은 1:1상속만 가능함
//class 자식클래스명 extends 부모클래스명{} 
public class Lion extends Mammal{
		private String gender; //새로 추가된 멤버

		@Override //상속받은것의 내용을 달리하고싶을때
		public void howling() {
			System.out.println("사자는 으허어어엉");
//그대로출력하고싶으면 >			super.howling();
		}
		
		
}
