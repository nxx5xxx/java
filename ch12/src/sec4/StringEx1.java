package sec4;

import java.util.Arrays;

public class StringEx1 {

	public static void main(String[] args) {
		//스트링을 바이트문자로 바꾸는것
		//byte[] 배열 = 스트링명.getBytes(); 문자열을 문자배열로
		String data = "자바12프로그래밍3";
		byte[] arr = data.getBytes();
		
//		System.out.println(Arrays.toString(문자배열명)); //문자배열 출력
		System.out.println(data); //문자열 출력
		System.out.println(arr); //문자 배열의 주소값
		System.out.println(Arrays.toString(arr)); //유니코드값으로 출력됨
		
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i]+" ,");
		}
		System.out.println();
		
		
		
		
		//문자배열을 문자열로
		//String 문자열명 = new String(문자배열명);
		String str = new String(arr);
		System.out.println(str);
		

	}

}
