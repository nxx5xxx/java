package sec1;

import java.util.ArrayList;
//컬렉션 프레임워크 : 객체의 모음을 처리하기 위한 자료구조인 , 자바 클래스
//List : 목록과 같은 데이터를 저장하기에 적합
//ArrayList , Vector , LinkedList 이중 어레이리스트가 제일 중요
public class ArrayLiseEx2 {

	public static void main(String[] args) {
		ArrayList<Student> stArr = new ArrayList<>(); //Student의 모음
		//ArrayList를 사용할시 Student는 요소가된다보면됨

		//개별요소인 Student의 객체를 생성하여 각 요소에 해당하는값을 저장
		Student st1 = new Student();
		st1.setNo(1);
		st1.setName("강아지");
		st1.setKor(100);
		st1.setEng(90);
		st1.setMat(95);
		stArr.add(st1);
		
		Student st2 = new Student();
		st2.setNo(2);
		st2.setName("고양이");
		st2.setKor(68);
		st2.setEng(82);
		st2.setMat(55);
		stArr.add(st2);
		
		Student st3 = new Student();
		st3.setNo(3);
		st3.setName("고라니");
		st3.setKor(50);
		st3.setEng(80);
		st3.setMat(45);
		stArr.add(st3);
		
		Student st4 = new Student();
		st4.setNo(4);
		st4.setName("송아지");
		st4.setKor(78);
		st4.setEng(68);
		st4.setMat(69);
		stArr.add(st4);
		
		for(Student i : stArr){
			System.out.println(i);
		}
		System.out.println("-------------------------");
		for(int i=0; i<stArr.size();i++){
			System.out.println(stArr.get(i));
		}
		System.out.println("-------------------------");
		for(int i=0; i<stArr.size();i++){
			Student s = stArr.get(i);
			System.out.println(s.toString());
		}
	}

}
