package sec1;

@FunctionalInterface
interface MyFnc4{
	int getCalc(int x, int y);
}

public class LambdaEx4_2 {
	
	//생성자
	public LambdaEx4_2(){
		MyFnc4 add = (a,b) -> {
			return a+b;
		};
		MyFnc4 minus = (a,b) -> {
			return a-b;
		};
		MyFnc4 multi = (a,b) -> {
			return a*b;
		};
		MyFnc4 div = (a,b) -> {
			return a/b;
		};
		System.out.println(add.getCalc(50, 60));
		System.out.println(minus.getCalc(80, 50));
		System.out.println(multi.getCalc(5, 4));
		System.out.println(div.getCalc(80, 40));
	}

	public static void main(String[] args) {
		new LambdaEx4_2();
		

		

	}

}
