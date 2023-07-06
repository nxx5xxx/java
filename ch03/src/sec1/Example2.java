package sec1;

public class Example2 {

	public static void main(String[] args) {
		//대입 연산자
		int a = 10;
		int b = 15;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a+=3; b-=3; //a=a+3  즉 13 , b=b-3 즉 12
		//10에 3을 더한값을 a에 대입하라는 뜻
		// (a + 3 을 한 값의 결과를 a에 저장하라는뜻)
		
		System.out.println();
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a*=3; b/=3; // a=a*3 즉 39 , b=b/3 즉 4
		
		System.out.println();
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		a%=2; //a=a%2 즉 1
		
		System.out.println();
		System.out.println("a="+a);
		
		int c =40;
		int d = 40;
		c<<=2; d>>=2; //c를 왼쪽으로 2만큼 자리이동 d를 오른쪽으로 2만큼 자리이동
		//쉬프트 연산자 (2진수로 바꾼후 좌, 우 로 자리이동(한칸당 *2 , /2)) /즉 160 , 10
		System.out.println();
		System.out.println("c="+c);
		System.out.println("d="+d);
		
	}

}
