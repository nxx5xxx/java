package sec3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//해쉬맵을 순서형으로 바꿔주기
public class LinkedHashMapEx1 {

	public static void main(String[] args) {
		Map<String, String> hm1= new HashMap<>();
		hm1.put("guest", "손님");
		hm1.put("member", "회원");
		hm1.put("admin", "관리자");
		System.out.println("HashMap");
		for(Entry<String, String> entry : hm1.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println("\nLinkedHashMap"); //순서형으로 바꾼것
		Map<String,String> lhm1=new LinkedHashMap<>();
		lhm1.put("guest", "손님");
		lhm1.put("member", "회원");
		lhm1.put("admin", "관리자");
		
		for(Entry<String,String> entry : lhm1.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println();
		//.remove(키);
		//.containsValue(값);
		//.containsKey(키);
		lhm1.put("final", "최종수정자");
		lhm1.remove("guest");
		for(Entry<String,String>entry : lhm1.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println(lhm1.containsKey("guest"));
		System.out.println(lhm1.containsValue("최종수정자"));
		
		
	}

}
