package sec1;

public class Carex1 {

	public static void main(String[] args) {
		Car car1 = new Car(); //sec1패키지에 다같이 있기때문에 Car라고만 써도 직접접근이 가능함
		//단 private를 걸어놨을경우 직접접근 불가
		System.out.println("제조사 : "+car1.company);
		car1.company ="기아"; //값 바꾸기 가능
		System.out.println("제조사 : "+car1.company);
		System.out.println("모델명 : "+car1.model);
		car1.model = "그랜져";
		System.out.println("모델명 : "+car1.model);
		
		//private로 걸려있을경우 게터와 세터로 갖고와야하므로
		System.out.println("제조사 : "+car1.getCompany());
		car1.setCompany("현대");
		System.out.println("제조사 : "+car1.getCompany());
		
		//car1의 Body 설정
		Body body1 = new Body(); //Car에서 setBody가 Body를 넣도록되어있어서 넣음 (바디의 객체)
		car1.setBody(body1);
		//초기값
//		System.out.println(car1.getBody());//바디에서 소스>generate to string 을 하지않으면 주소만 출력된다
		System.out.println(body1.toString());
		
		//새로설정한 값
		body1.setStyle("쿠페");
		body1.setFrendar("투썹");
		body1.setBumper("솔리드");
		car1.setBody(body1); //setBody를 해야 getBody가 가능
		
		//car1의 Body값 불러오기
		Body body2 = new Body();
		body2 = car1.getBody(); //객체안에 객체가 들어갈때
		//get바디를 해서 결과를 불러옴
		//즉 body1은 set을 이용해 데이터를 집어넣기위함
		//body2는 get을 이용해 데이터를 불러오기위함
		System.out.println(body2.toString());
//		System.out.println(car1.getBody());
		
		
		//car1의 Engine 설정
		Engine eng1 =new Engine();
		System.out.println("엔진 기본값 : "+eng1.toString());
		eng1.setFuel("디젤");
		eng1.setCc(3500);
		eng1.setDisplace(4);
		car1.setEngine(eng1); //class에서 보면 set엔진을 하기위해 세팅할 engine이 필요함
		
		//car1의 Engine 값 불러오기
		Engine eng2 = new Engine();
		eng2 = car1.getEngine(); //class에서 보면 get엔질을 하기위해 받을곳이 필요함
		System.out.println(eng2.toString()); 
		
		//car1의 Tire설정
		Tire tire1 = new Tire();
		System.out.println("타이어 기본값 : "+tire1.toString());
		tire1.setName("미쉐린타이어");
		//tire1.setCount(4);
		car1.setTire(tire1);
		
		//car1의 Tire값 불러오기
		Tire tire2 = new Tire();
		tire2 = car1.getTire();
		System.out.println(tire2.toString());
		
	}

}
