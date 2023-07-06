package sec2;

public class Example1 {

	public static void main(String[] args) {
		//자동 형 변환 = auto casting=promotion
		//프로그램에서 용량(byte)이 작은 자료형의 데이터를 큰 자료형에 대입하거나 계산되어 입력될때 발생
		byte a = 120; //1byte
		short b = a; // 2byte
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		char c = 'B' ;
		int d = c;
	//	byte e = c; //byte가 char보다 작아서 형변환 불가
		byte e = (byte) c; //강제 형변환을 하면 가능 단, 1BTYE의 범위를 넘어가면(127을 넘어가면 불가)
		//강제형변환 : 큰 자료형에서 작은자료형으로 형변환
		System.out.println("c="+c); // : char c 출력 B
		System.out.println("d="+d); //char 'B'를 int로 형변환 한 값 : 66
		
		System.out.println("e="+e); //1Byte의 범위를 넘어간 c를 강제 형변환해서 byte e로 출력한값
		
		short f = 200;
		byte g = (byte) f; //강제형변환은 뭐든 가능하지만 원하는 값을 출력하는것이 불가능하다
		System.out.println("f="+f);
		System.out.println("g="+g); //200을 넣었지만 -56이 출력하는걸 볼수있음
		
	}

}
