package sec1;

import java.util.LinkedList;
import java.util.List;

//LinkedList는 검색 속도가빠르고 순서형배열
//단, 중간에 값이 추가,삭제 될경우 속도가 더 느림
//그 이전 노드와 다음 데이터의 주소를 둘다 계산하여야 하기때문 , 값을 땡기고 밀어서 그럼
public class LinkedListEx1 {

	public static void main(String[] args) {
		List<Integer> li1 = new LinkedList<>();
		li1.add(10);
		li1.add(20);
		li1.add(30);
		
		li1.add(0,0);
		
		li1.remove(2);
		
		for(Integer data : li1){
			System.out.println(data);
		}
		
		List<String> sl1 = new LinkedList<>();
		sl1.add("강아지");
		sl1.add("고양이");
		sl1.add("고라니");
		for(String data: sl1){
			System.out.println(data);
		}
		
		LinkedList<Student> stl = new LinkedList<>();
		Student st = new Student();
		st.setNo(1);
		st.setName("강아지");
		st.setKor(100);
		st.setEng(99);
		st.setMat(98);
		stl.add(st);
		for(Student data: stl){
			System.out.println(data);
		}
	}

}
