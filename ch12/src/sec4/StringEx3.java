package sec4;

import java.util.StringTokenizer;

public class StringEx3 {

	public static void main(String[] args) {
		String data = "강아지&고양이&거북이&고라니";
		StringTokenizer st = new StringTokenizer(data, "&");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()){ //hasMoreTokens는 남아있는값이 없으면 false로 반환
			System.out.println(st.nextToken());
		}
		
		//아니면
		String [] arr = data.split("&");
		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
//		=
		for(String x : arr){
			System.out.println(x);
		}
	}

}


//StringJoiner