package sec1;
//Exception (예외) : 문법적 오류는 없지만 비정상적인 실행을 하게 되는 경우
//문법적 오류 => Syntax Error
public class ExceptionEx1 {

	public static void main(String[] args) {
			String data = null;
//			System.out.println(data.toString()); //toString()은 문자열로 바꿔주는 메소드 <이런경우가 예외
			//예외처리 : 예외가 발생할것을 대비하여 그 예외의 내용을 확인하고, 정상적으로 처리하기 위한 방법
			//예외구문 : try { 실행할구문; } catch (Exception e) { 예외 상황메시지출력; }
			//ex
			//data = "가가가"; 데이터의 내용을 넣어주면 예외가 아니게됨
			try{
				System.out.println(data.toString());
			}catch(Exception e){
				e.printStackTrace(); //예외의 내용을 출력
			}
//			실행창에
//			java.lang.NullPointerException          --> Null값이 들어가 있다는것
//			at sec1.ExceptionEx1.main(ExceptionEx1.java:13)
//			오류가 뜸을 알수있다
			try{
				System.out.println(data.toString());
			}catch(NullPointerException e){ //Null값만 처리
				e.printStackTrace(); //예외의 내용을 출력
			}
	}

}
