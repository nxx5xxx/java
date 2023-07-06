package sec1;
//ArithmeticException (산술연산예외) : 부적절한 연산을 하는 경우 발생
public class ExceptionEx5 {

	public static void main(String[] args) {
		int a = 0 ;
		int b = 40 ; 
		
//		System.out.println(b / a); //콘솔에서만 오류가남 -> 문법적 오류가없음
		try{
			System.out.println(b / a); 
		}catch(ArithmeticException e){
			System.out.println("부적절한 연산입니다");
		}

	}

}
