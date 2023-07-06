package sec2;

public class Food2 {
	private String name;	//음식이름
	private int quantity; 	//음식 양
	private int price;
	//생성자함수
	//this.은 객체를뜻하고 this()는 생성자함수를 뜻함
	public Food2(){ //생성자이름은 클래스이름과같아야함
		
		//생성자함수 this를 활용한 필드값의 단계적인 초기화
		
		this("백반"); //1 푸드2()에 백반을 넣어주겠어
		//배반은 아래에 name을 호출
	}
	public Food2(String name){ //2. 스트링 타입으로 백반을 받는것
		this(name,500);
		//500은 quantity호출
	}
	public Food2(String name, int quantity){
		this(name, quantity, 8000);
		//8000은 price 호출
	}
	public Food2(String name, int quantity, int price){
		this.name = name; //현재 객체에 name이란 것을 받은것은 name이란 이름으로 하겠다
		this.quantity = quantity;
		this.price = price; 
	}
		
	//출력메소드
	@Override
	public String toString() {
		return "Food2 [name=" + name + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	/*
	//메소두
	public String getName() {
		return name;
	}
	public void setName(String name) {
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
	*/
	
}
