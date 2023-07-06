package sec1;
// 오류엔 두가지 : 문법적오류 - syntax error
// 런타임오류 : 문법적오류는 없으나 실행시키면 에러가나는것

//ClassNotFoundException (클래스부재) : 해당 클래스가 존재하지 않는경우 발생
// 해당 클래스의 라이브러리를 빌드 패스에 추가해 주어야함.
public class ExceptionEx6 {

	public static void main(String[] args) {
		try {
		//문법적오류는 아니나 의무적으로 예외처리(try , catch)를 해야하는경우
		Class.forName("oracle.jdbc.driver.OracleDriver"); //특정클래스 로딩
		//외부자원에 접근하려면 반드시 try catch가(예외) 가 들어가야함
		}catch(ClassNotFoundException e){
			System.out.println("해당 클래스를 찾을 수 없습니다.");
		}
		
	}

}
