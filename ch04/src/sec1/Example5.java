package sec1;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		/*
		 String sw = "?";
		   switch (sw){
					case "a":
					case "A":
							실행값
							break;
					case "b":
					case "B":
					//이런식으로 케이스 두개를 같이쓸수도있다
*/
		Scanner sc = new Scanner(System.in);

		boolean a= true;
				while(a){
					System.out.println("혈액형을 입력하세요 :");
					String sw=sc.nextLine();
									switch(sw){
											case "a":
											case "A":
												System.out.println("당신의 혈액형은 A형입니다.");
												a=false;
												break;
											case "b":
											case "B":
												System.out.println("당신의 혈액형은 B형입니다.");
												a=false;
												break;
											case "ab":
											case "Ab":
											case "AB":
											case "aB":
												System.out.println("당신의 혈액형은 AB형입니다.");
												a=false;
												break;
											case "O":
											case "o":
												System.out.println("당신의 혈액형은 O형입니다.");
												a=false;
												break;
											default:
												System.out.println("올바른 혈액형이 아닙니다.");
									}//while{}
			}
	}

}
