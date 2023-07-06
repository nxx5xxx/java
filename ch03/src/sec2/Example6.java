package sec2;

public class Example6 {

	public static void main(String[] args) {
		//비트 연산자 : 2진수 연산 &(and) , | , ^ , ~(not,보수:complement) ,>>(오른쪽시프트), <<,>>>
		int a = 40;
		int b = 25;
		
		System.out.println("a & b =" +(a&b));
		System.out.println("a | b = "+(a|b));
		System.out.println("a^b = "+(a^b));
		System.out.println("~a = "+(~a));//-47이 맞으나 int는 4byte 체계라 불가
		System.out.println("a >> 2  :"+(a>>2)); //2번만큼 2씩곱하기 2진수에서 2번 앞으로 옮기기
		System.out.println("a << 2  :"+(a<<2)); //2번만큼 2씩나누기 2진수에서 2번 뒤로 당기기
	}

}
