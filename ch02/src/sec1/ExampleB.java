package sec1;

public class ExampleB {

	public static void main(String[] args) {
			//bloolean : 부울 대수인 true 또는 false를 저장하는 자료형
		boolean a = true;
		boolean b = false;
		boolean c = !a; //!는 연산자의 반대 그러므로  c= false랑 같은뜻
		boolean d = !b; // ture

		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.print("d="+d);
		System.out.println("boolean의 표현범위 : "+ Boolean.TRUE +"  "+"또는  " + Boolean.FALSE );
		//sysout println은 한줄단위 : 출력 후 줄을 바꿈
		//print 는 줄을 안바꿈
		
	}

}
