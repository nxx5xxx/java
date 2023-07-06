package sec2;

public class Test1 {

	public static void main(String[] args) {
		String str="테스트 test 테스트";
		
		System.out.println(str.replace("테스트", "따스트"));
		System.out.println(str.indexOf(" "));
		System.out.println(str.replaceAll("[a-zA-Z]", "replaceAll"));
	}
	
}
