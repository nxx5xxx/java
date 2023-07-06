package sec1;

public class Example4 {

	public static void main(String[] args) {
		//비교 연산자 == , != , >, >=,<, <=
		//연산 결과는 true 또는 false
		int a = 15;
		int b = 17;
		
		System.out.println("a==b : " + (a==b)); //15와 17은 같다 --false(거짓)
		System.out.println("a!=b : " + (a!=b)); //15와 17은 같지않다 -True(진실)
		System.out.println("a>b : " + (a>b)); //15는 17보다 크다 --false(거짓)
		System.out.println("a>=b : " + (a>=b)); //15는 17보다 크거나 같다--false(거짓)
		System.out.println("a<b : " + (a<b)); //15는 17보다 작다 --True
		System.out.println("a<=b : " + (a<=b)); //15는 17보다 작거나 같다 --True
		
		String x = "Admin";
		String y = "Admin"; //문자열의 비교시에는 ==가 아닌 .equals() 해야한다

		System.out.println("x==y : "+ (x==y)); // true와 false는 나오지만 정확한 값이 나오지않는다
		//암튼  아님 equals써야함 반박시 네말이 다맞음
		System.out.println("x equals y : " + (x.equals(y)));
		
		
	}

}
