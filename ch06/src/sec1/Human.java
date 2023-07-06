package sec1;
//필드,메소드,생성자함수
//모든 클래스의 조상은 object class가 조상 : 오브젝트클래스로부터 만들어짐
public class Human {//여기서 public은 접근제한자라고함 public은 어떤클래스든지 부를수있는것
	private String name; 	//정식명칭 1 . 멤버필드 : 특정속성값을 저장또는 설정하기위한 멤버
//private : 접근제한자(생략하면 default) String : 타입 name : 멤버필드
	//int male;			//원래는 앞에 접근제한자가 들어가나 아무것도 안넣으면 default값이 잡힌다
	//public int male; public으로하면 보안이걸림 ????
	private int male;
	private int age;
	private int height;
	private int weight;
	//name male 등등을 속성,필드,어트리뷰트라고 함
	//DAO = 데이터 베이스 오브젝트 !중요
	//저장클래스 = VO(Value Object) , DAO(데이터엑세스 오브젝트)
	
//3. 생성자함수 :(Constructor) : 해당 클래스의 객체는 만드는 역할을 수행
//함수명은 클래스명과 동일해야함
//[접근제한자] 함수명([매개변수타입(int,float,String) 매개변수명,,,,,]){} 
/*	 ex) //생성자함수는 뭐가있나 : name과male을 받는 생성자함수가 있다 라고 말할수있음
  	public Human(String name, int male){
		super();
		this.name = name; //여기서 this는 클래스이름인 human을 뜻함
		this.male = male; //함수나 메소드이름이 같고 매개변수의 순서가 달라도 적용이됨 (==오버로딩이라고 함)
		//상속받은것은 오버라이딩 <맨 아래
	}
*/
	/*	 ex) 오버로딩 예제
  	public Human(int male, String name){
		super();
		this.name = name; //여기서 this는 클래스이름인 human을 뜻함
		this.male = male;
	*/ //생성자를 어떻게 구성했냐에따라 new Human() 여기 ()의 값이 정해짐 ex) h1 "이름" , 성별 .... h2 성별,"이름" 
//alt+shift+s>constructor using Fields를 누르면 생성자 함수를 만들수있는데
//아무것도 안넣으면 기본값으로 잡혀있다.(생략하면 기본 생성자가 존재됨.)
//반환타입이 있으면 메소드 없으면 생성자함수
//생성자함수 :객체를 만드는역할을 함

	
	
	//alt + shift + s >generate getter and setter
	public String getName() { //멤버 메소드(getter/setter)
	//2 .멤버메소드 : [()내에는 기능구현하거나 동작/ 을 시키기위한 멤버
//접근제한자 반환타입 메소드명([매개변수타입] 매개변수명){} //매개변수타입은 생략할수도있다
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMale() {
		return male;
	}
	public void setMale(int male) {
		this.male = male;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	//오브젝트의 구성자를 만드려면 alt+shift+s > toString
	//상속받은 메소드나 함수를 그 내부의 내용을바꾸는게 오버라이드
	//매개변수나, 반환타입은 동일하고 return안의 내용물만 바꿀수있음
}
