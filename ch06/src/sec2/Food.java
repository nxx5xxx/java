package sec2;

public class Food {
		//멤버필드 : 해당 객체가 갖고있는 값을 저장
		private String name;	//음식이름
		private int quantity; 	//음식 양
		private int price;		//가격
		
		
		//생성자함수 :생략을 하지않을경우 매개변수를 입력해야함
		public Food() {}
		public Food(String name) {
			this.name = name; //여기서 뒤에오는 name 매개변수이다
		}		
		public Food(String name, int quantity) {
			this.name = name;
			this.quantity = quantity;
		}
		
		public Food(String name, int quantity, int price) {
			this.name = name;
			this.quantity = quantity;
			this.price = price;
		}
		
		
		//출력 메소드 : 이것을 하지않고 x.toString()을 하면 주소만 출력된다
		@Override
		public String toString() {
			return "Food [name=" + name + ", quantity=" + quantity + ", price="
					+ price + "]";
		}
		
		//멤버 메소드 : 해당 객체의 기능이나 동작을 일어나도록 하는멤버
		
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {//setter를 통한 필드값의 초기화
			this.name = name;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
	
		
		
}
