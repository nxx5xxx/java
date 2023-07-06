package sec1;

public class Example2 {

	public static void main(String[] args) {
		
		//자바의 기본 자료형(primitive type) 변수는 반드시 초기화 되어야한다.
		//초기화는 int d=30; 이런걸 초기화라 함
		//byte, bool, short, int, long, float , double, char
		//하나의 데이터만 저장할수 있는 변수를 기본 자료형이라 한다
		//String
		byte a =127; //			1byte -128~127
		short c = 32766;//		2byte -2^15~(2^15-1)
		int d=65536; //			4byte -2^31~(2^31-1)
		long e=2147483647; //	8byte
		
		// 실수 = 부동소수점수 (floating point number) fpu=실수를 전문적으로 계산하는 cpu
		float f=3.14f; //			4byte 실수(소수점 이하가 있는 수 단! 뒤에 f를 붙여야함)
		double g=3.14d; //		8byte 실수 (뒤에 d를 붙여도되고 안붙여도되고)
		
		char h='k'; //				2byte 큰따옴표는 안되고 작은따옴표로 한글자만 저장 가능
		//2byte인 이유는 k만 저장되는것이 아닌 'k '이런식으로 null(빈칸)을 삽입하여 2byte이다.
		//그렇지만 실제로 메모리에서 취급하는것은 1byte
		char i=65;
		//char에 문자가 아닌 숫자를 집어넣을경우 그에 해당하는 문자가 나옴
		
		boolean b = true; //1byte 논리연산자 boolean은 true와 false만 가능
		
		System.out.println("i="+i);
		
		
	}

}
