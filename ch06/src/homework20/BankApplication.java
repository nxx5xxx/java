package homework20;

import java.util.Scanner;

import com.sun.xml.internal.ws.org.objectweb.asm.Type;

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean wsw=true;
		int sw;
		int cnt=0;
		int yesgetacc=1;
		String pandok;
		Account ac=new Account();
		Account Account[]=new Account[100];	
		for(int x=0;x<100;x++)Account[x]=new Account(); //초기화


		
//		ac.getCreate();
//		acc[0].getCreate();
		
		
		//		String a;
//		a = ac.sc.nextLine();
	
//		ac.getCreate();
//		System.out.println(ac.getAcc_num()+ac.getName()+ac.getMoney());
		while (wsw){
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택>");
			sw=Integer.parseInt(sc.nextLine());
					switch (sw){
						case 1:
							Account[cnt].Create();
							cnt++;
						break;
						case 2:
							System.out.println();
							for(int x=0;x<cnt;x++){
								Account[x].List();
							}
						break;
						case 3:
							System.out.println("------------");
							System.out.println("예금");
							System.out.println("------------");
							System.out.print("계좌번호 : ");
							yesgetacc=1;
							pandok=sc.nextLine();
									for(int x=0;x<cnt;x++){
											if(Account[x].getAcc_num().equals(pandok)){
												System.out.println("예금액 : ");
												long money=Long.parseLong(sc.nextLine());
												Account[x].Plusmoney(money);
												yesgetacc=0;
												break;
											}
											
									}
									if(yesgetacc==1)System.out.println("없는 계좌번호 입니다.");
								
						break;
						case 4:
							System.out.println("------------");
						System.out.println("출금");
						System.out.println("------------");
						System.out.print("계좌번호 : ");
						yesgetacc=1;
						pandok=sc.nextLine();
								for(int x=0;x<cnt;x++){
										if(Account[x].getAcc_num().equals(pandok)){
											System.out.println("출금액 : ");
											long money=Long.parseLong(sc.nextLine());
											Account[x].Minusmoney(money);
											yesgetacc=0;
											break;
										}
										
								}
								if(yesgetacc==1)System.out.println("없는 계좌번호 입니다.");
							
							
						break;
						case 5:
							System.out.println("프로그램 종료");
							wsw=false;
						break;
						default:
							System.out.println("잘못입력하였습니다.");
					}

			
		}
		
	}

}
