package sec1;

import java.util.ArrayList;
import java.util.Arrays;

public class CastingListEx2 {
//배열을 어레이리스트로
	public static void main(String[] args) {
		String arr1[] = {"강아지","고양이","송아지","망아지"};
		
		ArrayList<String> arl1 = new ArrayList<>(Arrays.asList(arr1));
		System.out.println(arl1);
		
		//요소마다 접근하여 하나씩 추가하는 방법
		ArrayList<String> arl2 = new ArrayList<>();
		for(String data : arr1){
			arl2.add(data);
		}
		System.out.println(arl2.toString());

	}

}
