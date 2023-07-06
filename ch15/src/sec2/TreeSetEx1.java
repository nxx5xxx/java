package sec2;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet<Integer> st1 = new TreeSet<>();//TreeSet생성
		st1.add(70);	//요소추가
		st1.add(40);	//40은 70보다 작으므로 왼쪽배치
		st1.add(90);	//90은 70보다 크므로 오른쪽배치
		st1.add(100);	//100은 90보다 크므로 오른쪽
		st1.add(50);	//50은 40보다 크므로 40의 오른쪽
		st1.add(80);	//80은 90보다 작으므로 90의 왼쪽 배치
		st1.add(90);		//Set은 중복이 안되므로 작업안함
		st1.add(70);		//중복 발생으로 인해 작업안함
		
		System.out.println("요소의 수"+st1.size());
		st1.remove(90); //특정 요소 값 제거
		System.out.println("90의 존재유무"+st1.contains(90));
		st1.clear();
		System.out.println("st1이 비어있으면 트루 : "+st1.isEmpty());

	}

}
//TreeSet
//					A
//			B				C
// 		D		E		F		G
//	  H  I
//
//
//근에 위치에 따라 용어가 달라짐
//이것을 트리운행법(Traversal)이라 함
//PreOrder(사 전) 근(Root)
//근 좌 우  ------ A B D H I E C F G
//
//InOder (맨 끝에 좌측부터)
//좌 근 우  ------ H D I B E A F C G
//
//PostOrder(사 후)
//좌 우 근  ------ H I D E B F G C A