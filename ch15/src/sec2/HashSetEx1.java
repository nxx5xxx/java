package sec2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set은 중복이안됨, 인덱스개념이없음
//인덱스가 없으므로 순서 유지를 보장하지 못한다.
//인덱스가 없으므로 .get에 의한 접근이 불가
//파이썬은 집한연산이 가능하나 자바에서는 집합연산이 불가
//HashSet과 TreeSet이있음
//HashSet은 해싱함수에의해 주소를계산
//TreeSet은 트리운용법에 대한 데이터를 접근(메모리가 결정)
public class HashSetEx1 {

	public static void main(String[] args) {
		Set<Integer> st1 = new HashSet<>();
		st1.add(50);
		st1.add(80);
		st1.add(90);
		st1.add(100);
		
		System.out.println("값의 존재유무 boolean값 : "+st1.contains(100));
		for(Integer data : st1){
			System.out.println(data);
		}
		
		st1.add(60);//값의 위치는 랜덤
		//set은 인덱스가없기때문에 remove명령을 쓸때에도 객체명.remove(익덱스번호)가 아닌 객체명.remove(값) 으로 해야한다
		st1.remove(50);
		
		System.out.println();
		Iterator<Integer> ist = st1.iterator();
		while(ist.hasNext()){ //다음값이 없을때 false로 반환함
			System.out.println(ist.next());
		}
		System.out.println();
		
		System.out.println(st1);
	

	}

}
