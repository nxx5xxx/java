package sec1;

public class Example2 {

	public static void main(String[] args) {
		//배열 선언
		int[] i_arr; //기본타입[] 배열명; , 기본타입 배열명[] (몇개의 원소인지 부정확하므로 주소배정이 안됨)
		int i_arr2[]; //개수를 지정해놓지않은 선언 - 선언만 해놔서 아직메모리할당을 못함(=heap의 주소를 배정못함)
		float[] f_arr;
		float f_att2[];

		
		//기본타입[] 배열명 = new 기본타입[개수]
		//기본타입 배열명[] = new 기본타입[개수]
		int i;
		int[] io_arr = new int[8]; //개수를 지정한 선언 - 개수를 지정하면 자동초기화가 됨
		String[] s_arr = new String[5]; // 즉 원소의 개수가 지정되면 주소배정이됨
		//System.out.println(i); 프리미티브 타입은 초기화를 하지않으면 출력불가
		
		System.out.println("s_arr : "+s_arr);	 
		System.out.println("io_arr : "+io_arr); //배열은 메모리에 할당이 되면(개수지정이되면) 그 주소가 나온다
		
		
		int[] arr = {1, 80, 50, 70};
		int arr2[] = {1, 80, 50, 70};
		
		for(int x=0;x<arr.length;x++){
			System.out.print(arr[x]+"\t");
		}System.out.println();
		//자바1.6이상은
		//for(int data : arr2){ } 라고치면 arr2에 있는 개수만큼 데이터를 메모한다
		for(int data : arr2){  //이렇게 하는것은 객체도가능 //추가 향상된 for문
			System.out.print(data+"\t");
		}
		//즉 for(int x=0;x<arr.length;x++) = for(int x :arr)
		
	}

}
