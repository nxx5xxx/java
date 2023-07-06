package sec2;

public class foodex1 {

	public static void main(String[] args) {
		//생성자 함수 : 클래스 이름과 같으며, 오버로딩을 통하여 여러 형태로 정의한 후 사용할 수 있으며
		//해당 매개변수의 개수 만큼 다양한 방법으로 객체를 생성 할 수 있다.
		Food f0 = new Food(); //넣어줬던 값이 없기때문에 초기화값으로 출력
		Food f1 = new Food("순두부찌개");
		Food f2 = new Food("순두부찌개", 515);
		Food f3 = new Food("순두부찌개", 515, 8000);
		
		System.out.println(f0.toString());
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());

	}

}
