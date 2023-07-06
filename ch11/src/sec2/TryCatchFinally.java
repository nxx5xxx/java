package sec2;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			String data = null;
			//data = "123";
			System.out.println(data.toString());
		}catch (Exception e){
			System.out.println("이유를 알 수없는 예외가 발생");
		}finally{ //예외 발생 유무에 상관없이 실행하는 구문
			System.out.println("프로그램 종료");
		}

	}

}
