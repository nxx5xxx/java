package sec2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {

	public static void main(String[] args) {
		HashSet<Board> st = new HashSet<>();
		for(int i = 0; i<11; i++){
			st.add(new Board(i , "제목"+ i, "내용"+i, "2023-04-05"));
		}
		
		//출력방법1
		for(Board data : st){
			System.out.println(data);
		}//순서가 뒤죽박죽이 되어있는것을 알 수 있다.
		
		System.out.println("***********************************************");
		
		//출력방법2
		Iterator it = st.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("***********************************************");
		
		System.out.println(st.toString());
		st.clear();
		System.out.println("HastSet st에 값이 비어있으면 true  :  "+st.isEmpty());
		
		//.isEmpty() 비어있냐 false true

	}

}
