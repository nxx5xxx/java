package sec3;

public class Example2 {

	public static void main(String[] args) {
		//정수, 문자열, 실수 지시자 세부적으로 출력 지시(제어)
		int d =1234;
		double f =2345.123456789d;
		String s = "I\'m a Boy";

		System.out.printf("%6d", d); //왼쪽 2칸 ,즉 자리수가 6보다 작으면 왼쪽에 남은 자리수만큼 채움
		System.out.printf("%-6d",d); //오른쪽 2칸
		System.out.printf("%d\n", d); //그대로 출력
		System.out.printf("%06d\n\n",d); // 남는 자리수만큼 0으로 채운다
//		System.out.printf("%.2d\n",d); 불가 
		
		System.out.printf("%f\n",f); //f값 출력(기본값 , 소수점6자리)
		System.out.printf("%15f\n",f); //소수점 포함 11글자라 앞에 4칸띄움
		System.out.printf("%.8f\n",f); //마지막 자리수 반올림해서 소수점 8번째까지 출력
		System.out.printf("%11.4f\n\n",f); // 마지막수 반올림해서 소수점 4번째까지 출력
		//9글자라 남은자리수 공백 2칸 채움
		
		System.out.printf("%s\n",s); //s값 출력
		System.out.printf("%15s\n",s); //6 i'm a boy 의 띄어쓰기포함 9글자 제외한 6글자만큼 앞에 공백채움
		System.out.printf("%-6s\n",s);// 뒤에 공백을 채우지않고 그냥 출력
		
	}

}
