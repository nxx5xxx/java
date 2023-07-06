package sec1;

import java.util.ArrayList;


//ArrayList를 배열로
public class CastingListEx1 {

	public static void main(String[] args) {
		ArrayList<String> arl1 = new ArrayList<>(); //List선언
		arl1.add("강아지");
		arl1.add("고양이");
		arl1.add("고라니");
		System.out.println(arl1);
		
		//사이즈로해야 나중에 어레이를 추가했을때 값을 또 변경안하고 알아서 커지게 할수있다.
		String[] arr1 = new String[arl1.size()];
		String[] arr3 = arl1.toArray(arr1);
		for(String data : arr3){
			System.out.println(data);
		}
		
		//이것을 짧게쓰면 아래처럼된다
		
		String[] arr2 = arl1.toArray(new String[arl1.size()]);
		for(String data : arr2){
			System.out.println(data);
		}
		
	}

}
