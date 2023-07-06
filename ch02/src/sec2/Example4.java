package sec2;

public class Example4 {

	public static void main(String[] args) {
		//문자열을 기본 타입으로 변환
		String a ="1004";
		String b = "7979";
		System.out.println(a+b); //스트링엔 문자열이 저장되는거라 8983이 아닌 10047979로 출력됨
		//그리하여 *.parse*(변수명) 을 사용하여 변환 (*는 변환하고싶은 타입)
		System.out.println(Short.parseShort(a) + Short.parseShort(b)); //이렇게 하면 8983으로 출력
		System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
		System.out.println(Long.parseLong(a)+Long.parseLong(b)); //Short , Integer, Long을 래퍼클래스라고 표현
		System.out.println(Float.parseFloat(a)+Float.parseFloat(b));//.뒤에는 메쏘드(=함수)
		System.out.println(Double.parseDouble(a)+Double.parseDouble(b));

	}

}
