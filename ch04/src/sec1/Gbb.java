package sec1;

import java.util.Scanner;

public class Gbb {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int com=(int) (Math.random()*3)+1;
		System.out.println("가위바위보[1]가위 [2]바위 [3]보");
		int a = sc.nextInt();
		System.out.println("나 : "+a);
		System.out.println("컴퓨터 : "+com);
			switch(a){
				case 1:
					if(com==1){
						System.out.println("draw");
					}else if(com==2){
						System.out.println("lose");
					}else{
						System.out.println("win");
					}
				break;
				case 2:
					if(com==1){
						System.out.println("win");
					}else if(com==2){
						System.out.println("draw");
					}else{
						System.out.println("lose");
					}
				break;
				case 3:
					if(com==1){
						System.out.println("lose");
					}else if(com==2){
						System.out.println("win");
					}else{
						System.out.println("draw");
					}
				break;
					default:
						System.out.println("잘못입력하였습니다");
			}
		
		sc.close();
	}

}
