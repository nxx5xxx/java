package sec5;
//교재 525p

//References : Wrapper , Class
//포장클래스
//단지 객체로 생성하는것이 목적
public class WrapperEx1 {

	public static void main(String[] args) {
		//Boxing(=Wrapping) : 기본형을 래퍼(Wrapper)형으로 바꿀경우
		int a = 333;
		Integer b = a;
		Integer d = 333;
		//값은같음
		
		
		//Unboxing : 래퍼(Wrapper)형을 기본형으로 바꾸는경우
		int c = b;
		
		
		
		
		
		System.out.println(b==d);
		//박싱되어있는것은 객체이므로 주소를 비교해서 false가 나온다
		System.out.println(b.equals(d));
		//이꿜로 비교하면 포장값을 비교해줘서 true가 나온다
		System.out.println(a==b);//기본형과 래퍼형을 비교시 둘다 숫자만보고 비교해서 트루가 나옴
		
		
		//단 예외적으로
		//다음 범위의 값을 갖는 포장 객체는 공유된다
		//boolean : true,false / char \\u000 ~ \u007f / byte,short,int : -128~127
		//ex
		Integer x =10;
		Integer y =10;
		System.out.println(x==y);
	}

}
