package sec4;

import java.util.Scanner;

public class Calex1 {

	public static void main(String[] args) {
		//즉, Calculator는 객체 생성이 필요없는 static으로만 구성되어 있어 객체 생성을 할 필요가 없다
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		System.out.println("구하고싶은 원의 반지름을 입력하세요 : " );
		x=sc.nextInt();
		double circle = x*x*Calculator.pi;
		System.out.println("원의 넓이는 :" +circle);
		System.out.println("입력하는 두 개의 값을 더하고 빼고 곱하고 나누어 줍니다");
		x=sc.nextInt();
		y=sc.nextInt();
		int res1 = Calculator.plus(x, y);
		int res2 = Calculator.minus(x, y);
		int res3 = Calculator.multiple(x, y);
		float res4 = Calculator.div(x, y);
		System.out.printf("더하기 %d\n 빼기 %d\n 곱하기%d\n 나누기%f\n",res1,res2,res3,res4);
		//교재 251p
		
	}

}
