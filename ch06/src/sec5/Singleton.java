package sec5;
//싱글톤
// : 하나의 객체를 생성하여 이객체로 연결되어진 모든프로젝트나 패키지가 같이 변경되게 하기위한 자바 디자인 패턴임
//=공유객체 = 공유데이터 = 쉐어데이터
public class Singleton {
		//교재 273p
	
		//private static 클래스명 singleton = new  생성자함수()
		private static Singleton singleton = new Singleton();
		//생성자함수도
		//private  클래스명() {}
		private Singleton(){}
		//외부에서 생성하지 못하게끔 private를 걸어버림
		
		//둘다 private니까 메소드로 접근
		
		//메소드 형식
		//public static 클래스명 getInstance(){ return singleton; }
		public static Singleton getInstance(){ return singleton; }
	
}
