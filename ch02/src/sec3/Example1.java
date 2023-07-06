package sec3;

public class Example1 {

	public static void main(String[] args) {
		//서식지정자를 이용한 출력 (Format Specifiers)
		int i = 236;
		float z = 16f;
		char c = 'K';
		char d = 'I';
		char e = 'M';
		String s = "KIM";
		float f = 3.14f;
		double g = 3.141592d;
		System.out.printf("i를 10진수로 출력 : %d\n", i); //printf는 형식을 나타내는 문자 
		// %d 는 decimal =10진수 \n은 출력 후 엔터
		// %d같은 형식이 n개 들어가면 ,i같은 값이 n개 만큼 들어가야한다
		System.out.printf("i를 참/거짓 출력 : %b\n", i); //%b = bit ,boolean
		System.out.printf("i를 8진수로 :  %o\n", i); //%o  otal 8진수
		System.out.printf("i를 16진수로 : %x\n",i); // %X를 대문자로 넣을경우 EC가 대문자로나옴
		System.out.printf("i를 16진수로 : %X\n",i); // heX 16진수
		//	System.out.printf("i를 지수 형태로 출력 : %e \n",i ); // i가 정수라 실수로 불가
		System.out.printf("16.000000을 지수 형태로 출력 : %e \n",z );
		// 
		System.out.printf("%C %c %c\n" , c,d,e);
		System.out.printf("문자열 : %s\n", s);
		System.out.printf("실수 : %f\n" , f);
		System.out.printf("%n실수2 : %f\n" , g);
	}

}
