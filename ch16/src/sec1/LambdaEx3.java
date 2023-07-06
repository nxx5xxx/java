package sec1;

@FunctionalInterface
interface MyFnc3{//매개변수는 있고, 반환(리턴)이 없는 람다식
	void fnc3(int a);
}
public class LambdaEx3 {
	//생성자
	public LambdaEx3(){
		MyFnc3 f1 = (a) -> {System.out.println(a+"가 입력되었습니다.");}; //f1에 대한 내용을 구현해준것
		f1.fnc3(100); 
		
	/*풀이
	 * f1이라고 이름을 정의하고 추상화된 인터페이스를 구현하는과정
	 * fnc3(int a)라고 만든 인터페이스에
	 * f1이라는 System.out.println(a+"가 입력되었습니다.");라는 살을 붙여 구현화하고
	 * f1.fnc3(100); a에 100을 넣고 호출한것임.
	 */
		MyFnc3 f2 = (a) -> {System.out.println(a+a);};
		f2.fnc3(100);
		
		MyFnc3 f3 = (a) -> {
			int x=(a*a+a+a+a+a+a);
			System.out.println("a*a+a+a+a+a+a"+(a*a+a+a+a+a+a));
			if(x>a){
				System.out.println(x+" 는 "+a+"보다 큽니다");
			}else{
				System.out.println(x+" 는 "+a+"보다 작습니다");
			}
		};
		f3.fnc3(9);
	}
	//->는 어로우 연산자라고한다 : 왼쪽의 내용을 ->로 가서 실행하라 라는뜻
	public static void main(String[] args) {
		new LambdaEx3();

	}

}
