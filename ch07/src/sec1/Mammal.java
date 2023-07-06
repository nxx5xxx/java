package sec1;
//Animal의 자식클래스 (subclass)

public class Mammal extends Animal{
		private String foods; //새로 추가된 멤바
		private String birthType; //난생/태생/난태생
		//난생 : 알이 밖으로 나와서 자람
		//태생 : 태반에 둘러쌓여 자람
		//난태생 : 알을 낳지않고 안에서 자람
		public String getFoods() {
			return foods;
		}

		public void setFoods(String foods) {
			this.foods = foods;
		}

		//상속받은 메소드에 대하여 처리할 내용을 새로 덮어씌우는것을
		//오버 라이드라 한다.
		@Override
		public void howling() {
			System.out.println("포유류가 웁니다");
		}
		
	
}
