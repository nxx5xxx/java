package sec2;

public class Carex1 {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.company = "현대";
		car1.fuel = "가솔린";
		car1.model = "아이오닉";
		car1.cc = 1399;
		
//		System.out.println(car1.toString()); //toString 지정을 하지않아 주소로 출력됨
		System.out.println("차량회사 : "+car1.company);
		System.out.println("기름종류 :"+car1.fuel);
		System.out.println("차종 : "+car1.model);
		System.out.println("배기량 : "+car1.cc+"cc\n");
		car1.startUp();
		for(int x=0;x<120;x++){
			car1.speedUp();
		}
		System.out.println("현재 차의 시속은 : "+car1.speed+"km/h");
		for(int x=0;x<120;x++){
			car1.speedDown();
		}
		System.out.println("현재 차의 시속은 : "+car1.speed+"km/h");
		car1.turnOff();

	}

}
