package sec5;

import java.util.Arrays;

public class RandomEx1 {

	public static void main(String[] args) {
			//로또 복권 랜덤 발생기 , 아무거나 6개 숫자를 무작위로 발생시켜 출력
		int lotto[]=new int[6];
		for(int x=0; x<6;x++){
			lotto[x]=(int)(Math.random()*45)+1;
				
				if(x<5&&lotto[x+1]==lotto[x]){
				while(lotto[x+1]==lotto[x]){
				lotto[x]=(int)(Math.random()*45)+1;
				}
				}
			System.out.println(lotto[x]);
		}
		System.out.println();
		Arrays.sort(lotto);//배열정렬
		for(int data : lotto){
			System.out.println(data);
		}
//		Arrays.equals(arr1, arr2) 배열끼리 비교 - boolean값으로 나옴
		
		
	}

}
