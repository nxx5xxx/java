package sec2;

public class Example2 {

	public static void main(String[] args) {
		//바깥 for문은 안의for문이 모두 실행되면 그때 다시 실행된다
		//(카운트가 증가되고) 안의 for문은 초기화돼서 다시 시작
		//ex ) (0,0) (0,1) (0,2) (1,0) (1,1) (1,2)
		//해당 데이터마다 끄집어내서 반복수행하는것을 배열
		
		for(int a=0; a<9; a++){ //배열예제 //줄
			//배열은 이중for문으로 반복실행문써야함
			for(int b=0; b<5; b++){ //칸
				System.out.print(a+", "+b+"\t");
			}
			System.out.println();
		}
		
		/*
		 * 
		 **
		 ***
		 ****
		 위 모양이 출력되도록 중첩 for문을 활용하여 프로그램하시오.
		 
		 */

		for(int q=0; q<5; q++){
			for(int p=q; p<4; p++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//정답

		for(int q=1; q<=4; q++){
			for(int p=1; p<=5-q; p++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//또다른답안
		for(int q=4; q>=1; q--){
			for(int p=1; p<=q; p++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//반대로
		for(int q=4; q>=1; q--){
			for(int p=1; p<=5-q; p++){
				System.out.print("*");
			}
			System.out.println();
		}
		//또 다른답안

		for(int q=0; q<5; q++){
			for(int p=1; p<=q; p++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
