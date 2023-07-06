package sec1;
class MyFunction4{//매개변수도 있고 리턴도 있는 메소드
	int add(int x, int y){
		return x+y;
	}
	int sub(int x, int y){
		return x-y;
	}
	int mul(int x, int y){
		return x*y;
	}
	float div(int x, int y){
		return (float)x/y;
	}
	
}
public class FunctionEx4 {

	public static void main(String[] args) {
		MyFunction4 fnc4 = new MyFunction4();
		System.out.println(fnc4.add(50, 80));
		System.out.println(fnc4.sub(50, 30));
		System.out.println(fnc4.mul(5, 4));
		System.out.println(fnc4.div(50, 10));
		
		   int a    =    fnc4.add(50, 80);
		   int b    =    fnc4.sub(50, 30);
		   int c    =    fnc4.mul(5, 4);
           float d    =    fnc4.div(50, 10);
           System.out.println(a);
           System.out.println(b);
           System.out.println(c);
           System.out.println(d);
	}

}
