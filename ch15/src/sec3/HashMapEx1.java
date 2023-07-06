package sec3;

import java.util.HashMap;
import java.util.Map;
//656p
//Map : 키(Key)와 값(value)로 이루어진 자료 구조로 키는 필드명(항목이름)으로 활용, 값은 그 필드의 값을 저장할 때 활용
//Entry와 keySet을 활용하여 요소에 접근함
//맵은 Key가 인덱스가 됨
//Key는 중복이안된다 - 중복될경우 가장 마지막에 넣은 중복되는키에있는 값으로 변경됨
//키와 값을 갖는 JSON객체와 호환이된다
//키에는 순서가없어서 순서를 보장못함
import java.util.Map.Entry;


//HashMap, HashTable,
public class HashMapEx1 {

	public static void main(String[] args) {
	//Key는 String아니면 Integer로 해야함
	//value는 객체도 들어갈 수 있지만 굳이 클래스를 불러오기보다는 값을 직접넣는것이 낫다
		Map<String , String> map1 = new HashMap<>();
		map1.put("name", "강아지"); //put으로 요소를 추가한다
		map1.put("age", "5");
		map1.put("blood", "O");
		
		//HashMap의 순회 1 (Entry를 사용한 요소접근)
		for(Entry<String, String> entry: map1.entrySet()){
			System.out.println("[Key] : "+entry.getKey()+"\t[Value]: "+entry.getValue());
		}
		System.out.println();
		//keySet()을 사용한 요소 접근)
		for(String i : map1.keySet()){
			System.out.println("[Key] : "+i+"\t[Value]: "+map1.get(i));
		}
		System.out.println("-------------------------------------");
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "과자");
		map2.put(2, "음료수");
		map2.put(3, "과일");
		
		for(Entry<Integer, String>entry : map2.entrySet()){
			System.out.println("[key] : "+entry.getKey()+"\t[value]: "+entry.getValue());
		}
		
		map2.put(2, "같은키를가진 맵");
		map2.put(4, "다른키 밸류추가");
		map2.replace(3, "값을변경");
		map2.remove(1);//특정 키 제거
		System.out.println();
		
		for(Integer x:map2.keySet()){
			System.out.println("[Key]: "+x+"\t[Value] : "+map2.get(x));
		}
		System.out.println();
		System.out.println("HashMap의 크기\t:"+map1.size());
		System.out.println("특정키 존재유무\t\t:"+map1.containsKey("age"));
		System.out.println("특정 밸류 존재유무\t:"+map1.containsValue("5"));
		System.out.println("빈 HashMap인지 확인\t:"+map1.isEmpty());
		System.out.println("HashMap의 키 목록 확인\t:"+map1.keySet());
		
	}

}
