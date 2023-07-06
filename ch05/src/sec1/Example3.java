package sec1;

public class Example3 {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;

		//실제 주소배정이 이루어진 후 배정된 주소를 포인터라 함
		arr1 = new int[]{1, 96,88,100}; 
		arr2 =arr1; //얕은복제 - 주소를 복사해옴
		System.out.println(arr1);
		System.out.println(arr2);
		
		for(int x:arr1){
			System.out.print(x+"\t");
		}System.out.println();
		for(int x:arr2){
			System.out.print(x+"\t");
		}System.out.println(); //주소를 복사해와서 값도 똑같다
		//System.out.println("arr3 :"+arr3);  --arr3는 포인터인 실제 주소를 배정하지 않았으므로 NullPointerException 에러가 뜬다
		System.out.println("arr1==arr2 : "+(arr1==arr2)); //arr1의 주소와 arr2의 heap의 주소가 같은가 
//인덱스=키
	}

}
