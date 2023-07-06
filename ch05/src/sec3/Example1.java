package sec3;

public class Example1 {

	public static void main(String[] args) {
		
		//Student.java와 같이봐야함
		
		//클래스에 대한 배열
		//생겼다가 없어지는것은 객체(인스턴스)
		//ex)붕어빵 = 인스턴스 ----------붕어빵을 만들기위한 틀 = 클래스
		//클래스 : 객체(인스턴스)를 만들기 위한 틀 - 설계도

		//사용자 클래스를 활용한 배열
		
		//클래스명 객체명 = new 클래스명(=생성자함수명)();
		Student st1 = new Student(); //1명의 학생객체가 만들어짐 - 단일객체
		
		//클래스명[] 인스턴스명 = new 클래스명[개수];
		Student[] st = new Student[8]; //8명의 학생객체가 만들어짐 - 클래스에 대한 배열 - 배열객체
		
		
	}

}
