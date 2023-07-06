package sec3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {
//Map과 stack을 제외하고는 add로 추가
//Queue는 Fifo구조를 가지는 인터페이스
//위로 쌓이는게아니라 양쪽으로 쌓인다고보면됨
//큐는 인터페이스이므로 객체를 생성하려면 LinkedList로 생성해야함
	//모든 컬렉션프레임워크는 for(타입 x : 프레임명)가능
	public static void main(String[] args) {
		Queue<Integer> q1 =new LinkedList<>();
		q1.add(90);
		q1.add(70);
		q1.offer(100);//offer도 add와 같은 추가
		q1.add(80);
		q1.offer(75);
		
		System.out.println(q1.toString());
		System.out.println(q1.peek());//처음값 반환
		System.out.println(q1.poll());//처음값 반환후 삭제 (peek후 remove)
		q1.remove();//처음값 삭제
		System.out.println(q1.toString());
		for(Integer i : q1){
			System.out.println(i);
		}
		
		q1.clear();
		
		
		

	}

}
