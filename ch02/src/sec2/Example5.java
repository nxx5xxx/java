package sec2;

public class Example5 {

	public static void main(String[] args) {
		String a = "true"; //논리
		String b ="false";
		String c = "3.14";
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println(Boolean.parseBoolean(a)); //문자열 true에서 논리값 true가 됨
		//System.out.println(Byte.parseByte(a)); // 문자열 true를 Byte로 바꿀수없음
		//System.out.println(Short.parseShort(a));
		//System.out.println(Integer.parseInt(a));
		//System.out.println(Long.parseLong(a)); 4개 다 NumberFormatException
		System.out.println(Float.parseFloat(c));
		System.out.println(Double.parseDouble(c));
	}

}
