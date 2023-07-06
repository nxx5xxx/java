package sec1;

public class Example1 {

	public static void main(String[] args) {
		//데이터타입 //스택은 거꾸로쌓임 (이러한 구조를 (lifo = last in first out)
		//기본형(원시형 = 프리미티브타입) : boolean byte short int long char float double
		//데이터가 한가지만 저장되기때문에 원시형이라함
		//직접접근(스택에 저장됨) , 메모리접근을 한번만함 
		
		//참조형(리퍼런스 타입 = 열거형, 복수형) : 배열형, 열거형, 클래스(DAO=VO), 인터페이스(추상체)
		//여러가지 데이터 저장이 가능(스택에 저장되는게 아님)
		//스택에는 heap의 주소만 저장됨
		//데이터가 있는곳의 주소를 불러와서 적용하므로 참조타입이라 함(간접접근)
		//heap와 같은구조를 fifo (first in first out) -이러한 스택구조를 Q라고함
		//참조형이 데이터를 효율적으로 돌릴수있다.
		
		//배열형 int[] 배열이름 = {};
		int[] arr = {1, 80, 50, 70}; //1줄짜리배열 = 1차원배열
		//arr[0]==1,arr[1]==80,arr[2]==50,arr[3]==70 (arr의 0번째 배열은1 1번째배열은 80  여기서 1,80,50,70 은 원소라고한다.
		//[0] , [1],[2],[3]은 첨자 혹은 인덱스라고 한다.
		for(int i=0; i<arr.length ; i++){
			System.out.println(arr[i]); //배열이름.length == 배열의 길이
		}
		
		int[][] arr2 = {{1,2,3,4},{7,8,9,0}}; //=2차원배열 2줄 4칸짜리 (이런식으로하면 3차원배열도 가능)
		//이런경우 arr2[0][0] == 1 , arr[0][1] == 2 이런식으로 된다.  앞의 []는 행 인덱스 , 뒤에 []는 칸 인덱스
		
		int[][] arr3 = {{1,90,80,60},{2,70,86,95}};
		System.out.println("번호\t국어\t수학\t영어");
		for(int x=0;x<2;x++){
			for(int y=0;y<4;y++){
				System.out.print(arr3[x][y]+"\t");
			}System.out.println("");
		}
		
		String[] arl={"3","2"};
		
		
		
		
	}

}
