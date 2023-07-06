package sec3;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapEx1 {
	//정렬된 데이터 조회는 검색이 더 빠름 - 이게아닐경우 해쉬맵을거의씀
//TreeMap : 이진트리를 기반으로 한 Map 인터페이스의 서브클래스이며,
//TreeSet은 값만저장되지만 TreeMap은 키와 값 모두 저장함
//HashMap은
	public static void main(String[] args) {
		TreeMap<Integer,String> tm1 = new TreeMap<>();
		tm1.put(1, "사과");
		tm1.put(2, "복숭아");
		tm1.put(3, "수박");
		
		TreeMap<Integer,String> tm2 = new TreeMap<Integer,String>(){{
			put(1,"사과");
			put(2,"복숭아");
			put(3,"수박");
			
		}};
		
		tm2.remove(2);
		System.out.println(tm1);
		System.out.println(tm2);
		System.out.println(tm1.get(1));//해당키값 출력
		System.out.println(tm1.firstEntry());//최소Entry출력
		System.out.println(tm1.lastEntry());//최대Entry출력
		System.out.println(tm1.firstKey());//최소키값 출력
		System.out.println(tm1.lastKey());//최대키값 출력
		
		//entrySet()활용
		for(Entry<Integer,String>entry: tm1.entrySet()){
			System.out.println("[키] : "+entry.getKey()+"\t[값] : "+entry.getValue());
		}
		
		//KeySet활용
		
		for(Integer i : tm1.keySet()){
			System.out.println(i+":"+tm1.get(i));
		}

	}

}
