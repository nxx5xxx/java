package sec1;

import java.util.ArrayList;

//중요
//Collection Framework : 하나의 데이터가 아닌 데이터 모음을 다루기 위한 제네릭
public class ArrayListEx1 {

	public static void main(String[] args) {
		int[] point = new int[8]; //정수배열
		point[0]= 90;
		point[1]= 100;
		 
		int[] score ={90,80,100,85,95,80};//정수배열
		
//		Student[] st = new Student[10]; //객체배열
//		st[0].setNo(1);
//		st[0].setName("강아지");
//		st[0].setKor(100)~~~
		
		//배열을 리스트로 만들수 있는것이 ArrayList
		//배열은 각 요소의 값 들이 어떠한 특성을 갖고있는지 불분명하며, 선언시 반드시 개수가 규정될 필요가있음
		//ArrayList는 각 특성이 무엇인지 분명하고, 선언시 개수를 규정할 이유가 없이 원하는 만큼 요소의 값을 저장
		//값추가명령어 : 객체명.add(값); ,  리스트길이 : 객체명.size() [=.length]
		//값 갖고오기 : 객체명.get(인덱스순서);
		//제네릭명 <래퍼런스 타입 > 객체명 = new 제네릭명<>();
		ArrayList<Integer> arl1= new ArrayList<>();
		arl1.add(100);
		arl1.add(80);
		arl1.add(88);
		System.out.println(arl1.size()); //길이가 3임을 알수 있다
		for(int i=0;i<arl1.size();i++){
			System.out.println(arl1.get(i));
		}
		// 객체명.remove(인덱스) : 특정요소의 제거
		// 객체명.contains(값) :값 을 가진 인덱스의 유무 - true false
		// 객체명.indexOf(값) : 값의 인덱스 위치
		// 객체명.add(인덱스, 값) : 특정 위치에 요소 추가
		
		arl1.add(1,50);
		System.out.println(arl1.contains(100));
		arl1.remove(0);
		System.out.println(arl1.contains(100));
		System.out.println("해당 인덱스 위치 : "+arl1.indexOf(88));
		for(Integer data : arl1){ //arl1의 타입이 Integer이므로 Integer로 맞춰줘야함
			System.out.println(data);		
			}
		
	}

}
