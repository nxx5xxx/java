package sec2;

public class ExceptionThrows {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
//throws ~ : 일일히 예외처리 할수 없으니 자바프로그램이 알아서 처리하도록 떠넘기는것
		//478p 참조
	}

}
