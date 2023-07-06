package sec1;
//abstract를 클래스앞에 넣으면 추상화클래스
//재사용성을 올리기위해 구체적인 내용을 기술하지않고
//공통적인내용만 추상적으로 기술
//값을 미리넣으면 자식클래스에서 더 많이 수정하므로
//그러므로 필드는 값을 설정하지않고 메소드는 구현내용을 미리 기술하지않고 선언만한다.
public class StandardClass {
	public String fd1;
	public int fd2;
	public String method1(){
		return "메소드1";
	}
	//추상화메소드는 선언만 abstract가 없으면 빈메소드가 불가
	
	public String method2(){ //일반화 : 구현내용을 기술한다.
		return "메소드2";
	}
}

