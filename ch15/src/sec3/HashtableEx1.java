package sec3;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
//HashTable은 키와 값을 1:1형태로 가져간다 (null값을 못넣음)
//HashMap은 null입력이 가능
//비순서형
public class HashtableEx1 {

	public static void main(String[] args) {
		Map<String, String> tb1 = new Hashtable<>();
		//앞에 Hashtable을 Map으로 쓰면 Hashmap으로 형변환(형제끼리니까)이 가능해서 가능한 나중을 생각하여 Map을쓰는게좋다
//		Map<String, String> tb1 = new Hashtable<>();
		tb1.put("bno", "1");
		tb1.put("title", "제목");
		tb1.put("content", "내용");
		tb1.put("author","저자");
		
		//Entry를 사용한 요소접근
		for(Entry<String,String> entry : tb1.entrySet()){
			System.out.println("[키] :"+entry.getKey()+"\t[값] :"+entry.getValue());
		}
		System.out.println();
		//keySet
		for(String i : tb1.keySet()){
			System.out.println("[키] :"+i+"\t[값] :"+tb1.get(i));
		}
		
		System.out.println("*******************************************");
		
		Map<Integer, String> tb2 = new Hashtable<>();
		tb2.put(1, "치킨");
		tb2.put(2, "탕수육");
		tb2.put(3, "피자");
		for(Entry<Integer, String> entry : tb2.entrySet()){
			System.out.println("[키]:"+entry.getKey()+"[값]"+entry.getValue());
		}
		
	}

}
