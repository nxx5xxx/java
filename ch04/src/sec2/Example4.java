package sec2;

public class Example4 {

	public static void main(String[] args) {
		//while문을 활용한 1~100의 합계
		/*
		 초기값 부여식
		 while(조건){
		 반복실행할 문장1;
		 증감식;
		 반복실행할 문장2;
		 }
		 */
		int x=0;
		int sum1=0, sum2=0;
		while(x<=100){
			sum1+=x;
			x++;
			sum2+=x;
		}
		System.out.println(sum1);
		System.out.println(sum2); //x<=100 때문에 5151이 출력이됨
											//x가 100이되어도 x++에 의해 101까지 된 후 그값을 한번 더 더한걸 출력하므로
		
	}

}
