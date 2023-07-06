package sec2;

import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		//문자열과 문자 배열
		String str1 = "java program";
		char[] c_arr = {'j','a','v','a',' ','p','r','o','g','r','a','m'};
		
		//문자열과 문자 배열의 비교
		System.out.println(str1.equals(c_arr));
		//string과 char라서 비교불가
		
		//문자배열을 문자열로 변환1
		String str2 = Arrays.toString(c_arr);
		System.out.println(str1==str2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.equals(str2));
		
		//문자배열을 문자열로 변환2
		//StringBuilder : String 또는 char의 배열요소를 하나의 문자열 변환 
		StringBuilder strB3 = new StringBuilder();
		for(int i=0;i<c_arr.length;i++){
			strB3.append(c_arr[i]);
		}
		String str3 = strB3.toString();
		System.out.println(str3);
		System.out.println(str3.equals(str1));
		
		//문자배열을 문자열로 변환3 --이방법이 쉬움
		String str4 = new String(c_arr);
		System.out.println(str4==str1);
		System.out.println(str4.equals(str1));
		
		
		//문자열을 문자배열로 변환1
		char[] c1 = new char[str1.length()];
		for(int x=0;x<str1.length();x++){
			c1[x]=str1.charAt(x);
		}
		System.out.println(c1);
		System.out.println(c_arr);
		
		//문자열을 문자배열로 변환2 (1번방식을 줄인것)
		char[] c2 = str1.toCharArray();
		System.out.println(c2);
		
	}

}
