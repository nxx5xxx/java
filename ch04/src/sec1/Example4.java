package sec1;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		//조건분기문-선택문
		//switch ~ case ~ (이런 경우의수를 case라고 함)
		/*
		 switch(변수) {
		 	case 값1:
		 		실행문1;(변수의 값이 값1과 같다면 실행문1을 실행후 break;를  걸어라)
		 		break;
		 	case n;
		 		실행문n;
		 		break;
		 	default;
		 		실행문; (변수의값이 어느 case에도 속하지않으면 default를 실행함)
		 }
		 */
		//a+=b == a=a+b
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		long money;
		long balance=0;
		String id ;
		boolean ps =true;
		while(ps){
			//while은 ()값이 참인 동안 반복하여라 라는 뜻
				System.out.println("\n원하시는 번호를 누르세요[0-4]\n 1.입금\t2.출금\t3.조회\t4.가입\t0.취소");
				int num = sc.nextInt();
				switch(num){
						case 0:
							System.out.println("취소");
							ps = false;
						break;
						
						case 1:
							System.out.println("입금할 금액을 적으세요 : ");
							money = sc.nextLong();
							balance+=money;
							System.out.println("남은 잔액입니다 : "+balance);
						break;
						
						case 2:
							System.out.println("출금할 금액을 적으세요 : ");
							money = sc.nextInt();
							balance -=money;
							System.out.println("남은 잔액입니다 : "+balance);
						break;
						
						case 3:
							System.out.println("현재의 잔액은 : "+balance);
						break;
						
						case 4:
							System.out.println("가입할 계좌번호를 입력하세요 : ");
							id=sc2.nextLine();
							//nextInt다음 nextLine은 나오질못함
							//nextLine은 한줄단위라서
						break;
						default:
							System.out.println("번호를 잘못입력하였습니다");
				}
		}//
	}

}
