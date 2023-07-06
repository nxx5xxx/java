package sec2;
//익명의객체
public class Carex1 {

	public static void main(String[] args) {
		Car car= new Car();
		car.run1();
		//바구,이노바
		
		car.run2();
		//이메익객
		
		car.run3(new Tire (){ //방법은 세가지이나 이방법이 제일 나음
		//car안에있는 tire4에 roll에 내용을 오버라이딩함
			@Override
			public void roll() {
			 System.out.println("Tire를 매개변수로 하는 타이어가 굴러갑니다.");
			}
			
			
		});
		{
			
		}

	}

}
