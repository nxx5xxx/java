package homework;

import java.util.Scanner;

public class var7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String b;
		boolean c=true;
		while(c){
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.쫑료");
			System.out.println("-----------------------------");
			int a = sc.nextInt();
				switch(a){
					case 1:
						System.out.println("선택> "+a);
						System.out.print("예금액> ");
						b = sc2.nextLine();
					break;
					case 2:
						System.out.println("선택> "+a);
						System.out.print("출금액> ");
						b = sc2.nextLine();
					break;
					case 3:
						System.out.println("선택> "+a);
						System.out.print("출금액> ");
						b = sc2.nextLine();
					break;
					case 4:
						System.out.println("선택> "+a);
						System.out.println("프로그램 종료");
						c=false;
					break;
					default:
						System.out.println("번호를 잘못입력하셧습니다.");
						}
				}
		sc.close();
		sc2.close();
	}

}
