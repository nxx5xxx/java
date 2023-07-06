package sec1;
import java.util.*;
public class VectorEx1 {
//벡터는 쓰레드와 연동할수있다 단, 어레이 리스트도 연동이 가능하나 복잡할뿐
//Vector는 동기화 하는 싱글쓰레드에서 사용, - 최초의 리스트-  다른리스트와 혼용불가
//ArrayList는 멀티쓰레드, 싱글쓰레드에서 주로 사용된다
	public static void main(String[] args) {
			List<Integer> v1 = new Vector<Integer>();
			
			v1.add(90);//요소추가
			v1.add(100);
			v1.add(93);
			
			v1.add(0, 99);
			
			v1.remove(1);
			
			for(Integer data: v1){
				System.out.println(data);
			}
			for(int i = 0 ; i<v1.size();i++){
				System.out.println(v1.get(i));
			}
			System.out.println("******************");
			v1.clear();
			for(Integer data: v1){
				System.out.println(data);
			}
			System.out.println("******************");
			
			List<String> v2 = new Vector<String>();
			v2.add("강아지");
			v2.add("고양이");
			v2.add("고라니");
			for(String data : v2){
				System.out.println(data);
			}
			//Iterator를 활용한 요소 분리와 while 반복문
			//Iterator 뭉쳐져있는것을 분해하는것 (요소를 분리하는것 , 키와 값을 분리해낼때)
			//hasNext() : 더이상 다음값이 없을때까지
			Iterator iter = v2.iterator();
			System.out.println("iterator의 방식은 boolean : "+iter.hasNext());
			while(iter.hasNext()){
				System.out.println(iter.next());
			}
			
	}

}

//Iterator를 사용할 시 얻는 장점은 다음과 같다
//
//
//
//Iterator는 모든 컬렉션 프레임워크에 공통으로 사용 가능
//
//컬렉션 프레임워크에서 쉽게 값을 가져오고 제거할 수 있음
//
//3개의 메소드만 알면 되어서 사용하기 매우 쉽다
//
// 
//
//반면 단점은 다음과 같은데
//
// 
//
//처음부터 끝까지의 단방향 반복만 가능하고
//
//값을 변경하거나 추가가 불가능하고
//
//대량의 데이터를 제어할 때 속도가 느리다
