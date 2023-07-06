package sec1;

public class Car {
		//교재 212p,213p
		//멤버필드 - 프리미티브타입(기본형)
		/* private */ String company = "현대"; //제조사
		//private를 입력하면 이 car라는 class에서 밖에 접근을 못한다
		//private를 걸면 게터와 세터를 이용해서(public으로 해놧기때문) 접근해야함
		String model = "소나타"; //모델명
		String color = "black"; //색상
		int maxSpeed = 300; //최고속도
		int speed = 0;	//속도
		
		//멤버필드 - 래퍼런스타입(참조형)
		Body body;				//몸체
		Engine engine;			//엔진
		Tire tire;					//타이어
		
		
		//생성자함수
		//생략했을경우 public car(){}이것이 생략된것임
		
		//메소드
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getMaxSpeed() {
			return maxSpeed;
		}
		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public Body getBody() { //반환타입을 바디로
			return body;
		}
		public void setBody(Body body) { //바디클래스로 부터 유도된 객체라는뜻
			this.body = body;
		}
		public Engine getEngine() {
			return engine;
		}
		public void setEngine(Engine engine) {
			this.engine = engine;
		}
		public Tire getTire() {
			return tire;
		}
		public void setTire(Tire tire) {
			this.tire = tire;
		}
		
		
		
		
}
